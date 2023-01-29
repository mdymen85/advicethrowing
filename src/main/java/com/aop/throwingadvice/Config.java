package com.aop.throwingadvice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;

public interface Config {

//    @Bean
//    default ObjectMapper teste() throws Exception {
//        throw new Exception("Testing exception to advice catching");
//    }

    @Bean
    default String teste2() throws Exception {
        try {
            throw new RuntimeException("Testing RuntimeException to advice catching");
        }
        catch (RuntimeException e) {
            System.out.println("Capturing runtime exception {} " +  e.getMessage());
            throw e;
        }
    }

}
