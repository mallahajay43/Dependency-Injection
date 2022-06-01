package com.codhack.DependencyInjection.Controllers;

import com.codhack.DependencyInjection.services.GreetingServices;
import com.codhack.DependencyInjection.services.ConstructorGreetingServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Qualifier("setterGreetingServicesImpl")
    @Autowired
    private GreetingServices greetingServices;

    public void setGreetingServices(ConstructorGreetingServicesImpl setterGreetingServicesImpl){
        this.greetingServices=setterGreetingServicesImpl;
    }

    public String getGreeting(){
        return greetingServices.sayHello();
    }

}
