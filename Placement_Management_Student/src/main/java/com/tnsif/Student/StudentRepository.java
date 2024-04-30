package com.tnsif.Student;

import org.springframework.data.jpa.repository.JpaRepository;
// Importing JPA repository package

public interface StudentRepository extends JpaRepository<Student, Integer>
{
 
}
