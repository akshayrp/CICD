package com.example.cicd.Controller


import com.example.cicd.Service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    @Autowired
    lateinit var greetingService : GreetingService

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return greetingService.greeting(name)
    }

    @GetMapping("/goodby")
    fun goodBy(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return greetingService.goodBy(name)

    }
}
