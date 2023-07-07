package br.com.learn.circuitbreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.learn.circuitbreaker.feign.AutomationClient;
import br.com.learn.circuitbreaker.model.Patient;
import br.com.learn.circuitbreaker.service.AutomationService;
import br.com.learn.circuitbreaker.service.PatientService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
  
  private final PatientService patientService;
  private final AutomationService automationService;


  @GetMapping(path = "/{patientId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public PatientDTO getBin(@PathVariable Long patientId)
      throws Throwable {
    return patientService.findById(patientId).stream().map(this::mapper).findFirst().get();
  }

  private PatientDTO mapper(Patient patient) {
		return PatientDTO.of(patient, automationService.findAutomationDetail(patient.getId()));
	}
}