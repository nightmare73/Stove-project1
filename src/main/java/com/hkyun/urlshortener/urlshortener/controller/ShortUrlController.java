package com.hkyun.urlshortener.urlshortener.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortUrlController {

    @RequestMapping("/api/url/short")
    public String getShortenUrl() {
        return "ShortenUrl";
    }
}