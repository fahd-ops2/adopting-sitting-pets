package com.fahd.adopting.adoption.application.service;

import com.fahd.adopting.adoption.domain.Pet;
import com.fahd.adopting.adoption.domain.PetService;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Override
    public List<Pet> getAll() {
        return List.of();
    }

    @Override
    public Pet getPetById(Long id) {
        return null;
    }

    @Override
    public Long save(Pet pet) {
        return 0L;
    }

    @Override
    public List<Pet> getPetsPaginated(Pageable pageable) {
        return List.of();
    }
}
