package com.aop.throwingadvice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;

public interface Config {

    @Bean
    default ObjectMapper teste() throws Exception {
        throw new Exception("Testing exception to advice catching");
    }

}
