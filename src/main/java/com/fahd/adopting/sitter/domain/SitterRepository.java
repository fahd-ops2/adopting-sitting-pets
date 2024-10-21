package com.fahd.adopting.sitter.domain;

import java.util.List;

public interface SitterRepository {

    List<Sitter> getSittersWithPagination();

}
