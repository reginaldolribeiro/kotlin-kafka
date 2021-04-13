package com.kotlinkafka.kotlinkafka.controller

import com.kotlinkafka.kotlinkafka.producer.KotlinProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("message")
class MessageController (private val kotlinProducer: KotlinProducer) {

    @PostMapping
    fun publish(@RequestBody message: String){
        kotlinProducer.send(message)
    }
}