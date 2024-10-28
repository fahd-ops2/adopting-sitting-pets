package com.fahd.adopting.adoption.adapters.out.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSitterRepository  extends JpaRepository<SitterEntity,Long> {
}
