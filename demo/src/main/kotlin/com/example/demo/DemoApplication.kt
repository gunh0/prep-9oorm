package com.example.demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication {
    companion object {
        private val logger: Logger = LoggerFactory.getLogger(this::class.java)

        @JvmStatic
        fun main(args: Array<String>) {
            logger.info("Application starting...")
            runApplication<DemoApplication>(*args)
            logger.info("Application started.")
        }
    }
}
