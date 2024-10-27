package com.fahd.adopting.adoption.application.assembler;

import com.fahd.adopting.adoption.adapters.out.PetEntity;
import com.fahd.adopting.adoption.application.dto.PetDto;
import com.fahd.adopting.adoption.domain.Pet;
import com.fahd.adopting.shared.util.Assembler;

public class PetAssembler implements Assembler<Pet, PetEntity, PetDto> {

    @Override
    public Pet fromDtoToDomain(PetDto petDto) {
        return Pet.builder()
                .id(petDto.id())
                .name(petDto.name())
                .breed(petDto.breed())
                .age(petDto.age())
                .imageUrl(petDto.imageUrl())
                .build();
    }

    @Override
    public PetDto fromDomainToDTO(Pet pet) {
        return PetDto.builder()
                .id(pet.getId())
                .name(pet.getName())
                .breed(pet.getBreed())
                .age(pet.getAge())
                .imageUrl(pet.getImageUrl())
                .build();
    }

    @Override
    public Pet fromEntityToDomain(PetEntity petEntity) {
        return Pet.builder()
                .id(petEntity.getId())
                .name(petEntity.getName())
                .breed(petEntity.getBreed())
                .age(petEntity.getAge())
                .imageUrl(petEntity.getImageUrl())
                .build();
    }

    @Override
    public PetEntity fromDomainToEntity(Pet pet) {
        return PetEntity.builder()
                .id(pet.getId())
                .name(pet.getName())
                .breed(pet.getBreed())
                .age(pet.getAge())
                .imageUrl(pet.getImageUrl())
                .build();
    }

    @Override
    public PetDto fromEntityToDTO(PetEntity petEntity) {
        return PetDto.builder()
                .id(petEntity.getId())
                .name(petEntity.getName())
                .breed(petEntity.getBreed())
                .age(petEntity.getAge())
                .imageUrl(petEntity.getImageUrl())
                .build();
    }

    @Override
    public PetEntity fromDTOToEntity(PetDto petDto) {
        return PetEntity.builder()
                .id(petDto.id())
                .name(petDto.name())
                .breed(petDto.breed())
                .age(petDto.age())
                .imageUrl(petDto.imageUrl())
                .build();
    }
}
