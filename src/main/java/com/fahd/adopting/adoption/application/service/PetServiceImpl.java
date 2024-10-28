package com.fahd.adopting.adoption.application.service;

import com.fahd.adopting.adoption.adapters.out.jpa.PetEntity;
import com.fahd.adopting.adoption.adapters.out.jpa.PetJpaRepository;
import com.fahd.adopting.adoption.application.util.assembler.PetAssembler;
import com.fahd.adopting.adoption.application.dto.PetDto;
import com.fahd.adopting.adoption.domain.pet.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetJpaRepository petJpaRepository;
    private final PetAssembler petAssembler;

    @Override
    public List<PetDto> getAll() {
        List<PetEntity> petEntities = petJpaRepository.findAll();
        return petEntities.stream().map(petAssembler::fromEntityToDTO).toList();
    }

    @Override
    public PetDto getPetById(Long id) {
        PetEntity petEntity = petJpaRepository.findById(id).orElseThrow(()-> new RuntimeException("not found pet"));
        return petAssembler.fromEntityToDTO(petEntity);
    }

    @Override
    public Long savePet(PetDto pet) {
        PetEntity petEntity = petAssembler.fromDTOToEntity(pet);
        return petJpaRepository.save(petEntity).getId();
    }

    @Override
    public Page<PetDto> findWithPagination(Pageable pageable) {
        Page<PetEntity> petEntities = petJpaRepository.findAll(pageable);
        return petEntities.map(petAssembler::fromEntityToDTO);
    }

}
