package com.example.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/home")
    public String show(){
        return "home";
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(int number1,int number2,String option){
        ModelAndView mav = new ModelAndView("/result");
        switch (option){
            case "+":
                mav.addObject("result",number1+number2);
                return mav;
            case "-":
                mav.addObject("result",number1-number2);
                return mav;
            case "*":
                mav.addObject("result",number1*number2);
                return mav;
            case "/":
                mav.addObject("result",number1/number2);
                return mav;
            default:
                mav.addObject("result",0);
                return mav;
        }
    }
}
