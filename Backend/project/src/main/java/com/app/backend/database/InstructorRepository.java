package com.app.backend.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.backend.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {

    Instructor findInstructorByUsername(String username);
    Boolean existsInstructorByUsername(String username);
    Boolean existsInstructorByEmail(String email);
    void removeInstructorByUsername(String username);
}