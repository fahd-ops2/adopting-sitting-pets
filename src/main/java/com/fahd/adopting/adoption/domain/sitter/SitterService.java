package com.fahd.adopting.adoption.domain.sitter;

import java.util.List;
import java.util.Optional;

public interface SitterService {

    List<Sitter> getAll();

    Optional<Sitter> findById(Long id);

    Long save(Sitter sitter);
}
