package br.com.learn.circuitbreaker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.learn.circuitbreaker.controller.AutomationDTO;
import br.com.learn.circuitbreaker.feign.AutomationClient;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AutomationService {

    private final AutomationClient automationClient;

    public List<AutomationDTO> findAutomationDetail(Long patientId) {

        List<AutomationDTO> automation = new ArrayList<>();

        try {
            automation = automationClient.findAutomationDetail(patientId);
        }catch (Exception e) {
			throw e;
        }

        return automation;
    }



    
}
