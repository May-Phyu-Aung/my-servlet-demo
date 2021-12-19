package com.demo.framework.controller;

import com.demo.framework.ds.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

public interface IController {
    ModelAndView handleRequest(HttpServletRequest httpServletRequest);
}
