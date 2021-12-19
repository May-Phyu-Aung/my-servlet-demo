package com.demo.application.contoller;

import com.demo.application.view.IndexView;
import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.SampleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/")
public class indexController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest) {
        return new ModelAndView(
                new SampleModel(),
                new IndexView()
        );
    }
}
