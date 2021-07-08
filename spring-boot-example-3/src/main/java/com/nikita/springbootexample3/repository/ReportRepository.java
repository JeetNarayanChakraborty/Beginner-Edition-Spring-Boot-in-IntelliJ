package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report,Integer> {
}
