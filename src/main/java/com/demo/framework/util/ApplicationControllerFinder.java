package com.demo.framework.util;

import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import javassist.tools.reflect.Reflection;
import org.reflections.Reflections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ApplicationControllerFinder {



    public Map<String ,IController> findContollers(){
        return new Reflections()
                .getTypesAnnotatedWith(ControllerMapping.class)
                .stream()
                .map(this::getAsControllerClass)
                .map(this::getControllerInstance)
                .collect(Collectors.toMap(this::getUri, Function.identity()));
    }


    private Class<IController> getAsControllerClass(Class<?> controller){
        return (Class<IController>) controller;
    }

    private IController getControllerInstance(Class<IController> controller){
        try {
            return controller.getConstructor().newInstance();
        }catch (Exception e){
            throw new RuntimeException(
                    String.format("Error while creating instance of contoller %s",controller.getSimpleName()
                            ,e.getMessage()),
                            e
            );
        }
    }

    private String getUri(IController controller){
        return controller.getClass().getAnnotation(ControllerMapping.class).value();
    }
}
