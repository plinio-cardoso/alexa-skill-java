package com.pliniocardoso.alexaskill.Service;

import com.pliniocardoso.alexaskill.model.Advert;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertService {
    public List<Advert> getAdverts(String search_type, String location) {
        String rental = "rental";
        String sale = "sale";
        String galway = "Galway";
        String dublin = "Dublin";
        List<Advert> adverts = new ArrayList<>();

        if (!location.equals(galway) || !location.equals(dublin)) {
            return adverts;
        }

        if (search_type.equals(sale)) {
            return getSaleProperties(adverts, location);
        }

        if (search_type.equals(rental)) {
            return getRentalProperties(adverts, location);
        }

        return adverts;
    }

    private List<Advert> getSaleProperties(List<Advert> adverts, String location) {
        for (int i = 0; i <= 2; i++) {
            adverts.add(Advert.builder().address(getRandomAddress(location)).price(getRandomSalePrice()).build());
        }

        return adverts;
    }

    private List<Advert> getRentalProperties(List<Advert> adverts, String location) {
        for (int i = 0; i <= 3; i++) {
            adverts.add(Advert.builder().address(getRandomAddress(location)).price(getRandomRentalPrice()).build());
        }

        return adverts;
    }

    private Integer getRandomRentalPrice()
    {
        Integer random = (int)(Math.random() * 4 + 15);

        return random * 100;
    }

    private Integer getRandomSalePrice()
    {
        Integer random = (int)(Math.random() * 150 + 300);

        return random * 1000;
    }

    private String getRandomAddress(String location)
    {
        String galway = "Galway";
        String dublin = "Dublin";
        List<String> addresses = new ArrayList<>();

        if (location.equals(galway)) {
            addresses.add("Galway City Centre");
            addresses.add("Barna");
            addresses.add("Kingston");
            addresses.add("Newcastle");
            addresses.add("Dangan");
            addresses.add("Menlo");
        }

        if (location.equals(dublin)) {
            addresses.add("Rathmines");
            addresses.add("Rathfarnham");
            addresses.add("Clonskeagh");
            addresses.add("Rialto");
            addresses.add("Dundrum");
            addresses.add("Fairview");
        }

        int random = (int )(Math.random() * 5 + 1);

        return addresses.get(random);
    }
}
