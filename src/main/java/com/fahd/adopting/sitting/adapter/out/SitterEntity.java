package com.fahd.adopting.sitting.adapter.out;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sitters")
public class SitterEntity {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String experience;

    @Column
    private String location;

    @Column
    private String imageUrl;
}
