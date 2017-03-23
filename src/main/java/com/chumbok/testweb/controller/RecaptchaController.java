package com.chumbok.testweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mmahmood on 3/1/17.
 */

@Controller
public class RecaptchaController {

    @Value(value = "${com.chumbok.googleRecaptcha.siteKey}")
    private String siteKey;

    @Value(value = "${com.chumbok.googleRecaptcha.siteSecret}")
    private String siteSecret;

    @RequestMapping("/recaptcha")
    public String showRecaptcha(Model model) {
        model.addAttribute("siteKey", siteKey);
        return "recaptcha";
    }
}
