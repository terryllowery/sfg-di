package net.lowerytech.sfgdi;

import net.lowerytech.sfgdi.controllers.MyController;
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
	}

}
