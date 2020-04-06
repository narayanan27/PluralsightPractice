package com.pluralsight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.models.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long>{

}
