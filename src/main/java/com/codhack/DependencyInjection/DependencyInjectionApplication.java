package com.codhack.DependencyInjection;

import com.codhack.DependencyInjection.Controllers.CunstructorInjectedController;
import com.codhack.DependencyInjection.Controllers.PropertyInjectedController;
import com.codhack.DependencyInjection.Controllers.SetterInjectedController;
import com.codhack.DependencyInjection.Controllers.myController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DependencyInjectionApplication.class, args);

		myController controller=(myController) ctx.getBean("myController");
		String greetings=controller.sayHello();
		System.out.println(greetings);

		System.out.println("------- property");
		PropertyInjectedController pic=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(pic.getGreetings());

		System.out.println("------- setter");
		SetterInjectedController sic=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(sic.getGreeting());

		System.out.println("------- constructor");
		CunstructorInjectedController cic=(CunstructorInjectedController) ctx.getBean("cunstructorInjectedController");
		System.out.println(cic.getGreetings());
	}

}
