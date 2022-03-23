package com.chana.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String login() {
      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal());
        return "/callback";
    }

    @RequestMapping(value = "/home")
    @ResponseBody
    public String callback(@RequestParam(value = "code") String code, @RequestParam(value = "state") String state) {
        System.out.println("redirecting to home page");
        System.out.println("CODE: " + code);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getDetails());
        return "/home";
    }

}
