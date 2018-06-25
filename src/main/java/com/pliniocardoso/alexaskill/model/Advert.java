package com.pliniocardoso.alexaskill.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advert {
    @NotNull
    private String address;

    @NotNull
    private String description;

    @NotNull
    private String type;
}
