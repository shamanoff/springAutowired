package com.example.service;

import com.example.action.ISay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;

@Service
public class Speak {

    private final ISay iSay;
    @Autowired
    public Speak(ISay iSay) {
        notNull(iSay);
        this.iSay = iSay;
    }


    public void hello(String name){
       iSay.sayHello(name);
    }

    public void bay(String name){
        iSay.sayBay(name);
    }

}
