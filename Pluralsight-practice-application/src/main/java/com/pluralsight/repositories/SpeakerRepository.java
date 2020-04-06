package com.pluralsight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.models.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker,Long>{

}
