package com.sr.aop;


import com.sr.aop.model.GreetingResponse;
import com.sr.aop.services.IGrettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    private final IGrettingService grettingService;

    @Autowired
    public HelloController(IGrettingService grettingService) {
        this.grettingService = grettingService;
    }

    @GetMapping
    public ResponseEntity<GreetingResponse> handleGet(@RequestParam final String name)
    {
        return grettingService.getGreeting(name);
    }
}
