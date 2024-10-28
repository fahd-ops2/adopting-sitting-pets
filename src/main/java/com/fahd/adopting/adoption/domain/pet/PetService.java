package com.fahd.adopting.adoption.domain.pet;

import com.fahd.adopting.adoption.application.dto.PetDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PetService {

    List<PetDto> getAll();

    PetDto getPetById(Long id);

    Long savePet(PetDto pet);

    Page<PetDto> findWithPagination(Pageable pageable);

}
