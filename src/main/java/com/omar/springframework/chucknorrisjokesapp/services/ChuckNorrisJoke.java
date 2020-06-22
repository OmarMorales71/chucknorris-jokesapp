package com.omar.springframework.chucknorrisjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJoke implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJoke() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
