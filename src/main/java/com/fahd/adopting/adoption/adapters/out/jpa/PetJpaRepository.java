package com.fahd.adopting.adoption.adapters.out.jpa;

import com.fahd.adopting.adoption.domain.pet.PetRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetJpaRepository extends JpaRepository<PetEntity, Long>, PetRepository {

    Page<PetEntity> findAll(Pageable pageable);
}
