package com.codhack.DependencyInjection.Controllers;

import com.codhack.DependencyInjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CunstructorInjectedController {
    @Qualifier("constructorGreetingServicesImpl")
    @Autowired
    private GreetingServices greetingServices;

    CunstructorInjectedController(GreetingServices constructorGreetingServicesImpl){
        this.greetingServices=constructorGreetingServicesImpl;
    }

    public String getGreetings(){
        return greetingServices.sayHello();
    }
}
