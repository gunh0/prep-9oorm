package com.example.demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorldController {
    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping
    fun helloWorld(): String {
        logger.info("Received request for /")
        return "Hello, World!"
    }
}