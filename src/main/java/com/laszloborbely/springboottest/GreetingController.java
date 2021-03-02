package com.laszloborbely.springboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * GET greeting route
     *
     * @param name Person to greet
     * @return Hello, {name of the person}!
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
