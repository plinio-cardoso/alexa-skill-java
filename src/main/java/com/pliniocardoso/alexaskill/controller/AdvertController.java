package com.pliniocardoso.alexaskill.controller;

import com.pliniocardoso.alexaskill.Service.AdvertService;
import com.pliniocardoso.alexaskill.model.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/adverts")
public class AdvertController {
    @Autowired
    AdvertService advertService;

    @GetMapping("/{location}")
    public ResponseEntity<List> getAdverts(@PathVariable("location") String location) {
        List<Advert> adverts = advertService.getAdverts(location);

        return ResponseEntity.ok(adverts);
    }
}
