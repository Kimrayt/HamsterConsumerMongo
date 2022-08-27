package com.example.consumer.Repository;

import DTO.Data;
import Model.Hamster;
import Model.HamsterData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class AppConfig {


//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        return new LettuceConnectionFactory();
//    }


    @Bean
    public RedisTemplate<String, Hamster> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Hamster> dataTemplate = new RedisTemplate<>();
        dataTemplate.setConnectionFactory(redisConnectionFactory);
        return dataTemplate;
    }
}