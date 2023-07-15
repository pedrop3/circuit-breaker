package br.com.learn.circuitbreaker.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
  public ResponseEntity<PatientDTO> findById(@PathVariable Long patientId) {
    return ResponseEntity.ok(patientService
        .findById(patientId)
        .stream()
        .map(this::mapper)
        .findFirst()
        .orElseThrow());
  }

  private PatientDTO mapper(Patient patient) {
		return PatientDTO.of(patient, automationService.findAutomationDetail(patient.getId()));
	}
}