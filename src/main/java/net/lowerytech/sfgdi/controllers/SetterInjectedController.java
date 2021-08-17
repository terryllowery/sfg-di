package net.lowerytech.sfgdi.controllers;

import net.lowerytech.sfgdi.services.GreetingService;

public class SetterInjectedController {
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
