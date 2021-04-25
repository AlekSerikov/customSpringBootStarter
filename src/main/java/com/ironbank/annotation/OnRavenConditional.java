package com.ironbank.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnRavenConditional extends AllNestedConditions {

    public OnRavenConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty(value = "raven.where")
    public static class R {}

    @ConditionalOnProperty(value = "raven.turnOn", havingValue = "true")
    public static class C {}
}