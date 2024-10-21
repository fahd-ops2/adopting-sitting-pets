package com.fahd.adopting.pet.adapter.in;

import com.fahd.adopting.pet.domain.Pet;
import com.fahd.adopting.pet.domain.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pet")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping("/")
    public List<Pet> getPetList() {
        return petService.getAll();
    }

    @GetMapping("/{id}")
    public Pet getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }


}