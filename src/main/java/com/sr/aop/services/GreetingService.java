package com.sr.aop.services;

import com.sr.aop.annotations.RequiresLock;
import com.sr.aop.model.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingService implements IGrettingService{

    @RequiresLock
    public ResponseEntity<GreetingResponse> getGreeting(final String user){
        GreetingResponse response = new GreetingResponse();
        response.setGreeting("Hello " + user);
        response.setGenerated(LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
