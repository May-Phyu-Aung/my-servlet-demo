package com.demo.framework.model;

import java.util.HashMap;
import java.util.Map;

public class SampleModel implements Model{

    private Map<String,String> model=new HashMap<>();

    @Override
    public void set(String name, String value) {
        model.put(name,value);

    }

    @Override
    public String get(String name) {
        return model.get(name);
    }
}
