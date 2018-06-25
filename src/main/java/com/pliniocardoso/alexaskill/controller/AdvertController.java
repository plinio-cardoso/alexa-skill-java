package com.pliniocardoso.alexaskill.controller;

import com.pliniocardoso.alexaskill.Service.AdvertService;
import com.pliniocardoso.alexaskill.model.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/adverts")
public class AdvertController {
    @Autowired
    AdvertService advertService;

    @GetMapping
    public List<Advert> getTeachers() {
        return advertService.getAdverts();
    }
}
