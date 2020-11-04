package com.whz.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class PrintLoggerRule implements TestRule {

    public Statement apply(final Statement base, Description description) {
        System.out.println("Before test: " + description);
        try {
            return new Statement() {
                @Override
                public void evaluate() throws Throwable {
                    base.evaluate();
                }
            };
        } finally {
            System.out.println("After test: " + description);
        }
    }

}
