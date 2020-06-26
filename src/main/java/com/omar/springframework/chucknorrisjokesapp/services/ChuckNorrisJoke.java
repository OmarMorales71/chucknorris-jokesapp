package com.omar.springframework.chucknorrisjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJoke implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJoke(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
