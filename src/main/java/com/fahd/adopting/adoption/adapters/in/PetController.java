package com.fahd.adopting.adoption.adapters.in;

import com.fahd.adopting.adoption.application.dto.PetDto;
import com.fahd.adopting.adoption.domain.Pet;
import com.fahd.adopting.adoption.domain.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pet")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping("/")
    public List<PetDto> getPetList() {
        return petService.getAll();
    }

    @GetMapping("/page/{page}/{size}")
    public Page<PetDto> getPetsWithPagination(@PathVariable int page, @PathVariable int size) {
        return petService.findWithPagination(PageRequest.of(page, size));
    }

    @GetMapping("/{id}")
    public PetDto getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @PostMapping("/save")
    public Long savePet(@RequestBody PetDto pet) {
        return petService.savePet(pet);
    }


}
