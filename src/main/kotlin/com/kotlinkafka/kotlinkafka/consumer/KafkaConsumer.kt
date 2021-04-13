package com.kotlinkafka.kotlinkafka.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KotlinConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["load-test"], groupId = "kotlin-kafka")
    fun processMessage(message: String){
        logger.info("[kotlin-kafka-consumer] got message: {}", message)
    }
}