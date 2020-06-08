package com.wildcodeschool.questShieldSecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToTheShield {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "Barcelone," +
                "Berlin," +
                "Bruxelles," +
                "Bucarest," +
                "Budapest," +
                "Dublin," +
                "Lisbonne," +
                "Londres," +
                "Madrid," +
                "Milan," +
                "Biarritz," +
                "Bordeaux," +
                "Lille," +
                "La Loupe," +
                "Lyon," +
                "Marseille," +
                "Nantes," +
                "Orléans," +
                "Paris," +
                "Reims," +
                "Strasbourg," +
                "Toulouse," +
                "Tours";
    }
}
