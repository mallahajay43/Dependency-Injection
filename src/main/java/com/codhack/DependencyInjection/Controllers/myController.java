package com.codhack.DependencyInjection.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
    public String sayHello(){
        System.out.println("Hello World!!!");
        return "Hi folks";
    }
}
