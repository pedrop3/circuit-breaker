package br.com.learn.circuitbreaker.feign;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.learn.circuitbreaker.controller.AutomationDTO;

@Component
public class AutomationSessionClientFallback implements AutomationClient{

    @Override
    public List<AutomationDTO> findAutomationDetail(Long patientId) {
       return new  ArrayList<>();
    }
    
}
