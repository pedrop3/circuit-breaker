package br.com.learn.circuitbreaker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {

	private Long id;
	private String nome;
}
