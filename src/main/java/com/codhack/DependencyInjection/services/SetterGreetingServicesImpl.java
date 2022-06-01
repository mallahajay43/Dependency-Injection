package com.codhack.DependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServicesImpl implements GreetingServices{
    @Override
    public String sayHello() {
        return "Hi folks- Setter";
    }
}
