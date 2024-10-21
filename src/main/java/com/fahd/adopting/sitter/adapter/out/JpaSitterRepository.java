package com.fahd.adopting.sitter.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSitterRepository  extends JpaRepository<SitterEntity,Long> {
}
