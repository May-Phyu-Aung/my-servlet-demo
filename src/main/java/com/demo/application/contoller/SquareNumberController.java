package com.demo.application.contoller;

import com.demo.application.view.SquareNumberView;
import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.Model;
import com.demo.framework.model.SampleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/square-number")
public class SquareNumberController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request) {
        Model model=new SampleModel();

        int number=Integer.parseInt(request.getParameter("number"));
        int numberSquare=(int) Math.pow(number,2);

        model.set("number",String.valueOf(number));
        model.set("numberSquare",String.valueOf(numberSquare));

        return new ModelAndView(
                model,
                new SquareNumberView()
        );
    }
}
