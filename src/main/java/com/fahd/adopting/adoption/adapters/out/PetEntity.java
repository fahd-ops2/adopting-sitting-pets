package com.fahd.adopting.adoption.adapters.out;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pets")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String breed;

    @Column
    private String age;

    @Column
    private String imageUrl;
}
