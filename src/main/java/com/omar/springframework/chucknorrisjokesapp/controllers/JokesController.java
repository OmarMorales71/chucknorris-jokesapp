package com.omar.springframework.chucknorrisjokesapp.controllers;

import com.omar.springframework.chucknorrisjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        String joke = jokeService.sayJoke();
        model.addAttribute("joke", joke);
        System.out.println(joke);

        return "jokes/chucknorris";

    }
}
