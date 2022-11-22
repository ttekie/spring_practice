package com.springpractice.repositories;

import com.springpractice.models.NationalParks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalParksRepository extends JpaRepository<NationalParks, Long> {
}
