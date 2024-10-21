package com.fahd.adopting.pet.domain;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Pet {

    private Long id;
    private String name;
    private String breed;
    private String age;
    private String imageUrl;
}
