package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.dto.AppResponse;
import com.nikita.springbootexample3.entity.Patient;
import com.nikita.springbootexample3.entity.Report;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

    @Query("SELECT new com.nikita.springbootexample3.dto.AppResponse(p.name,r.test,r.status) FROM Patient p JOIN p.reports r")
    public List<AppResponse> getJoinInformation();
}
