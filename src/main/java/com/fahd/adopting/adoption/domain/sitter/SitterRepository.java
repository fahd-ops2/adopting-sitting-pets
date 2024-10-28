package com.fahd.adopting.adoption.domain.sitter;

import java.util.List;

public interface SitterRepository {

    List<Sitter> getSittersWithPagination();

}
