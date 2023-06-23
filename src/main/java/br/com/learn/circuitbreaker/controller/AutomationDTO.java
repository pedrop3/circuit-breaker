package br.com.learn.circuitbreaker.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutomationDTO {

	private Long id;
	private Integer dias;
	private String descricao;


}
