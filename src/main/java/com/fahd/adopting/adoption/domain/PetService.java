package com.fahd.adopting.adoption.domain;

import java.awt.print.Pageable;
import java.util.List;

public interface PetService {

    List<Pet> getAll();

    Pet getPetById(Long id);

    Long save(Pet pet);

    List<Pet> getPetsPaginated(Pageable pageable);

}
