package com.ironbank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "raven")
public class RavenProperties {

   private List<String> where;
   private boolean turnOn;

    public RavenProperties() {
    }

    public RavenProperties(List<String> where, boolean turnOn) {
        this.where = where;
        this.turnOn = turnOn;
    }

    public List<String> getWhere() {
        return where;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
}