package com.example.action;

import org.springframework.stereotype.Component;

@Component
public class SayPhrase implements ISay {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void sayBay(String name) {
        System.out.println("Bay " + name);
    }
}
