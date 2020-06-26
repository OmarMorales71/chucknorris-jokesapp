package com.omar.springframework.chucknorrisjokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Typing a configuration class
@Configuration
public class ChuckConfiguration {

    //Build a bean for a ChuckNorrisQuotes that is a external jar/library
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
