package com.fahd.adopting.sitting.domain;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Sitter {

    private Long id;
    private String name;
    private String experience;
    private String location;
    private String imageUrl;
}
