package com.aop.throwingadvice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @UnauthorizedException
    @Bean
    public ObjectMapper teste() throws Exception {
        throw new Exception("Testing exception to advice catching");
    }


}
