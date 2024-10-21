package com.fahd.adopting.pet.domain;

import java.awt.print.Pageable;
import java.util.List;

public interface PetRepository {

    List<Pet> getPetsWithPagination(Pageable pageable);

}
