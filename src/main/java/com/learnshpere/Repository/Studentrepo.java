package com.learnshpere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.learnshpere.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
