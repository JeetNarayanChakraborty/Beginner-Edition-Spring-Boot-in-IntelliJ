package com.nikita.springbootexample3.controller;

import com.nikita.springbootexample3.dto.AppRequest;
import com.nikita.springbootexample3.dto.AppResponse;
import com.nikita.springbootexample3.entity.Patient;
import com.nikita.springbootexample3.repository.PatientRepository;
import com.nikita.springbootexample3.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private ReportRepository reportRepository;
    @PostMapping("/addEntry")
    public Patient addEntry(@RequestBody AppRequest request){
        return patientRepository.save(request.getPatient());
    }
    @GetMapping("/findAllEntry")
    public List<Patient> findAllEntry(){
        return patientRepository.findAll();
    }
    @GetMapping("/getInfo")
    public List<AppResponse> getJoinInformation(){
        return patientRepository.getJoinInformation();
    }
}
