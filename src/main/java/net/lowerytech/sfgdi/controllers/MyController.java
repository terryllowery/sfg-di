package net.lowerytech.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHi(){
        System.out.println("Hello from Mycontroller blah blah blah");
        return "Hello from " + MyController.class.toString();
    }
}
