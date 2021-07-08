package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.dto.DoctorRequest;
import com.nikita.springbootexample3.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
    // Get all details of specified specs - JPQL Query
    @Query("SELECT d from Doctor d where d.specs=?1")
    public List<Doctor> getDspecs(String specs);
    // Get all details of specified specs - SQL Query
    @Query(value = "SELECT * from Doctor d where d.specs=?1",nativeQuery = true)
    public List<Doctor> getDspecss(String specs);

    // Get unique value pairs from Doctor Entity
    @Query("SELECT DISTINCT new com.nikita.springbootexample3.dto.DoctorRequest(d.dname,d.specs) from Doctor d")
    public List<DoctorRequest> getAllDoctors();
}
