package com.example.startersExample.service;

import com.ironbank.RavenListener;
import com.ironbank.RavenProperties;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class MyRavenListener extends RavenListener {

    public MyRavenListener(RavenProperties ravenProperties) {
        super(ravenProperties);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("From user listener " + contextRefreshedEvent);
    }
}