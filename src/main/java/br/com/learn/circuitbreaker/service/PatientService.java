package br.com.learn.circuitbreaker.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.learn.circuitbreaker.feign.AutomationClient;
import br.com.learn.circuitbreaker.model.Patient;


@Service
public class PatientService {

 

	private static final List<Patient> PATIENTS = new ArrayList<>();
	private static long id = 1;

	//Inicializador dos statics
	static {
		PATIENTS.add(new Patient(id++, "Pedrão"));
		PATIENTS.add(new Patient(id++, "Cruz"));
		PATIENTS.add(new Patient(id++, "Brunão"));
	}

  

  public Optional<Patient> findById(Long patientId)  {
    return PATIENTS
			.stream()
			.filter(e -> e.getId().equals(patientId))
			.findFirst();
  }
}