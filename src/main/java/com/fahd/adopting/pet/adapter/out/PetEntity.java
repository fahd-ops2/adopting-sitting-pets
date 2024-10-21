package com.fahd.adopting.pet.adapter.out;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "pets")
public class PetEntity {

    @Id
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
