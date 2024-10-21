package com.fahd.adopting.sitter.domain;

import java.util.List;
import java.util.Optional;

public interface SitterService {

    List<Sitter> getAll();

    Optional<Sitter> findById(Long id);

    Long save(Sitter sitter);
}
