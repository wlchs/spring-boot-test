package com.laszloborbely.springboottest.greeting;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    /**
     * General template for each message
     */
    private static final String template = "Hello, %s!";

    /**
     * Unique message identifier generator
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * @return Hello, {name of the person}!
     */
    @GetMapping("/greeting")
    public Greeting greeting() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return new Greeting(counter.incrementAndGet(), String.format(template, auth.getPrincipal()));
    }
}
