package com.kotlinkafka.kotlinkafka.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.config.TopicBuilder

@Configuration
@EnableKafka
class KafkaConfig {
    @Bean
    fun newTopic(): NewTopic {
        return TopicBuilder.name("load-test")
            .partitions(1)
            .replicas(1)
            .build()
    }
}
