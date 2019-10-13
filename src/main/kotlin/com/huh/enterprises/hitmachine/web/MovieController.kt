package com.huh.enterprises.hitmachine.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController {

    @GetMapping("/")
    fun helloWorld(): String {
        return "hello world";
    }
}