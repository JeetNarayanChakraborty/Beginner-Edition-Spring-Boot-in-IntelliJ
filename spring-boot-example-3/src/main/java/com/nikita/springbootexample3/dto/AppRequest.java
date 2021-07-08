package com.nikita.springbootexample3.dto;

import com.nikita.springbootexample3.entity.Patient;
import com.nikita.springbootexample3.repository.PatientRepository;
import com.nikita.springbootexample3.repository.ReportRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppRequest {

    private Patient patient;
}
