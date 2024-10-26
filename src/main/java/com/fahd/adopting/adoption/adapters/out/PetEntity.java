package com.fahd.adopting.adoption.adapters.out;


import jakarta.persistence.*;

@Entity
@Table(name = "pets")
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
