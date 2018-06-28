package com.pliniocardoso.alexaskill.controller;

import com.pliniocardoso.alexaskill.Service.AdvertService;
import com.pliniocardoso.alexaskill.model.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/adverts/search")
public class AdvertController {
    @Autowired
    AdvertService advertService;

    @GetMapping("/{search_type}/{location}")
    public ResponseEntity<List> getAdverts(
            @PathVariable("search_type") String search_type,
            @PathVariable("location") String location
    ) {
        List<Advert> adverts = advertService.getAdverts(search_type, location);

        return ResponseEntity.ok(adverts);
    }
}
