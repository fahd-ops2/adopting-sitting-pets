package com.fahd.adopting.pet.adapter.out;

import com.fahd.adopting.pet.domain.Pet;
import com.fahd.adopting.pet.domain.PetRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface JpaPetRepository  extends JpaRepository<PetEntity, Long>, PetRepository {

    @Query()
    List<Pet> getPetsWithPagination(Pageable pageable);
}
