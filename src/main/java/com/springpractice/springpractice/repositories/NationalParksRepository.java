package com.springpractice.springpractice.repositories;

import com.springpractice.springpractice.models.NationalParks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalParksRepository extends JpaRepository<NationalParks, Long> {
}
