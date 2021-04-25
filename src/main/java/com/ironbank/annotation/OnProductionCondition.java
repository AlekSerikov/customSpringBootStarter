package com.ironbank.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Scanner;

public class OnProductionCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println("On production yes/no?");
        Scanner scanner = new Scanner(System.in);
        String approve = scanner.next();
        return approve.contains("yes");
    }
}
