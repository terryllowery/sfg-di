package net.lowerytech.sfgdi;

import net.lowerytech.sfgdi.controllers.ConstructorInjectedController;
import net.lowerytech.sfgdi.controllers.MyController;
import net.lowerytech.sfgdi.controllers.PropertyInjectedController;
import net.lowerytech.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext c = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) c.getBean("myController");

		String greeting = myController.sayHi();
		System.out.println(greeting);

		System.out.println("--------Property--------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) c.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------Setter---------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) c.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("---------Constructor---------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) c.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGreeting());
	}

}
