package com.sr.aop.services;

import com.sr.aop.model.GreetingResponse;
import org.springframework.http.ResponseEntity;

public interface IGrettingService {

    ResponseEntity<GreetingResponse> getGreeting(final String username);
}
