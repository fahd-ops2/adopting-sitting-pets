package com.fahd.adopting.adoption.application.dto;

import lombok.Builder;

@Builder
public record PetDto(Long id,
                     String name,
                     String breed,
                     String age,
                     String imageUrl) {
}
