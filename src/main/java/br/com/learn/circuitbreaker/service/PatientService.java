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

 

	private static final List<Patient> PACIENTES = new ArrayList<>();
	private static long id = 1;

	//Inicializador dos statics
	static {
		PACIENTES.add(new Patient(id++, "Pedrão"));
		PACIENTES.add(new Patient(id++, "Cruz"));
		PACIENTES.add(new Patient(id++, "Brunão"));
	}

  

  public Optional<Patient> findById(Long patientId) throws Throwable {
    return PACIENTES.stream().filter(e -> e.getId().equals(patientId)).findFirst();
  }
}