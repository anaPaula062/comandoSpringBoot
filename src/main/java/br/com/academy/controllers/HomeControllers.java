package br.com.academy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControllers {
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        mv.addObject( "msg", "mensagem vinda do controller");
        return mv;
    }
}
