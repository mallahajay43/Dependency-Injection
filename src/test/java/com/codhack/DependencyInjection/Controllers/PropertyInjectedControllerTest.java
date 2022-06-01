package com.codhack.DependencyInjection.Controllers;

import com.codhack.DependencyInjection.services.ConstructorGreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();
        controller.greetingServices=new ConstructorGreetingServicesImpl();

    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}