package com.sr.aop.model;

import java.time.LocalDateTime;

public class GreetingResponse {

    private String greeting;
    private LocalDateTime generated;


    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public LocalDateTime getGenerated() {
        return generated;
    }

    public void setGenerated(LocalDateTime generated) {
        this.generated = generated;
    }
}
