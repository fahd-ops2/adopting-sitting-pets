package com.fahd.adopting.sitter.application.service;

import com.fahd.adopting.sitter.domain.Sitter;
import com.fahd.adopting.sitter.domain.SitterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SitterServiceImpl implements SitterService {

    @Override
    public List<Sitter> getAll() {
        return List.of();
    }

    @Override
    public Optional<Sitter> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long save(Sitter sitter) {
        return 0L;
    }
}
