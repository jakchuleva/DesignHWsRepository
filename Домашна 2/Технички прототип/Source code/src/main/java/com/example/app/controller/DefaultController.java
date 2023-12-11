package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {

    @GetMapping("site.mk")
    public String getDefaultPage()
    {
        return ("HomePage");
    }

    //todo Мора да имплементирам нешто за да прима /login..
    //todo
    @GetMapping("login") //todo site.mk/login
    public String getLogInPage()
    {
        return("LogIn");
    }

    @GetMapping("signup")
    public String getSignUpPage()
    {
        return ("SignUp");
    }

    @GetMapping("profile")
    public String getProfilePage()
    {
        return ("Profile");
    }

    @GetMapping("search")
    public String getSearchPage(){
        return ("Search");
    }


}
