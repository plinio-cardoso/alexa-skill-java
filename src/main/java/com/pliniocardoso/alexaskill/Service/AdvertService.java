package com.pliniocardoso.alexaskill.Service;


import com.pliniocardoso.alexaskill.model.Advert;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertService {
    public List<Advert> getAdverts() {
        List<Advert> adverts = new ArrayList<>();
        adverts.add(Advert.builder().address("Test1").description("Desc1").type("Rental").build());
        adverts.add(Advert.builder().address("Test2").description("Desc2").type("Sale").build());
        adverts.add(Advert.builder().address("Test3").description("Desc3").type("New Development").build());
        adverts.add(Advert.builder().address("Test4").description("Desc4").type("Rental").build());

        return adverts;
    }
}
