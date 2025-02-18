package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    private final HelloService helloService = new HelloService();

    @Test
    void testGetGreeting() {
        String greeting = helloService.getGreeting();
        assertEquals("Hello from Spring Boot on EKS with a Service Layer!", greeting);
    }
}
