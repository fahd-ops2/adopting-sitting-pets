package com.fahd.adopting.sitting.adapter.in;

import com.fahd.adopting.sitting.domain.Sitter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/sitter")
public class SitterController {

    @GetMapping("/")
    public List<Sitter> getSitterList() {
        return null;
    }

    @GetMapping("/{id}")
    public Sitter getSitterById(Long id) {
        return null;
    }


}
