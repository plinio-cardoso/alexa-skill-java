package com.pliniocardoso.alexaskill.Service;


import com.pliniocardoso.alexaskill.model.Advert;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertService {
    public List<Advert> getAdverts(String location) {
        String galway = "Galway";
        String dublin = "Dublin";
        List<Advert> adverts = new ArrayList<>();

        if (location.equals(dublin)) {
            adverts.add(Advert.builder().address("Rathmines").description("Description 1").build());
            adverts.add(Advert.builder().address("Rathfarnham").description("Description 2").build());
            adverts.add(Advert.builder().address("Clonskeagh").description("Description 3").build());
            adverts.add(Advert.builder().address("Killiney").description("Description 4").build());
            adverts.add(Advert.builder().address("Kilmore").description("Description 5").build());
        }

        if (location.equals(galway)) {
            adverts.add(Advert.builder().address("Ballybane").description("Description 1").build());
            adverts.add(Advert.builder().address("Doughiska").description("Description 2").build());
            adverts.add(Advert.builder().address("Renmore").description("Description 3").build());
        }

        return adverts;
    }
}
