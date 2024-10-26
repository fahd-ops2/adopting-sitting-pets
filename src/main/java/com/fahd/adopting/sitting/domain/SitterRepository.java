package com.fahd.adopting.sitting.domain;

import java.util.List;

public interface SitterRepository {

    List<Sitter> getSittersWithPagination();

}
