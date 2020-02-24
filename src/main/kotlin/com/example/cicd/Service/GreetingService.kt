package com.example.cicd.Service

import com.example.cicd.Model.Greeting
import org.springframework.stereotype.Service

@Service
class GreetingService {

    fun greeting(name: String):String{
        var greet = Greeting("Hello , $name nice to meet you !!!!")
        return greet.message
    }

    fun goodBy(name: String):String{
        var bye = Greeting("GoodBy , $name see you soon !!!")
        return bye.message
    }
}
