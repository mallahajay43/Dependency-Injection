package com.codhack.DependencyInjection.Controllers;

import com.codhack.DependencyInjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServicesImpl")
    @Autowired
    public GreetingServices greetingServices;

    public String getGreetings(){
        return greetingServices.sayHello();
    }
}
