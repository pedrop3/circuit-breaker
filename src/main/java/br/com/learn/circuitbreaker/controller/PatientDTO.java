package br.com.learn.circuitbreaker.controller;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.learn.circuitbreaker.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class PatientDTO {

	private Long id;
	private String nome;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public List<AutomationDTO> automationDetail;

    public static PatientDTO of(Patient patient, List<AutomationDTO> automationDetail) {
		return new PatientDTO(
			patient.getId(),
			patient.getNome(),
			automationDetail
	);
    }

}
