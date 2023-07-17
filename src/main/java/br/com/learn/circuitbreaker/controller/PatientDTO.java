package br.com.learn.circuitbreaker.controller;

import java.util.List;

import br.com.learn.circuitbreaker.model.Patient;

public record PatientDTO  (Long id, String name, List<AutomationDTO> automationDetail){

    public static PatientDTO of(Patient patient, List<AutomationDTO> automationDetail) {
		return new PatientDTO(
			patient.getId(),
			patient.getName(),
			automationDetail
		);
    }


}
