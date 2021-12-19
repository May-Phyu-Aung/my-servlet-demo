package com.demo.application.view;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class AddNumberView implements View {
    @Override
    public String render(Model model) {
        return String.format(
                "Result of adding numberA=[%s] and numberB = [%s] is [%s]",
                model.get("numberA"),model.get("numberB"),model.get("result")
        );
    }
}
