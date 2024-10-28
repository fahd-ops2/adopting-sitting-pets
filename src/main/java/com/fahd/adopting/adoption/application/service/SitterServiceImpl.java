package com.fahd.adopting.adoption.application.service;

import com.fahd.adopting.adoption.domain.sitter.Sitter;
import com.fahd.adopting.adoption.domain.sitter.SitterService;
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
