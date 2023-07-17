package br.com.learn.circuitbreaker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.learn.circuitbreaker.controller.AutomationDTO;
import br.com.learn.circuitbreaker.feign.AutomationClient;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AutomationService {

    private final AutomationClient automationClient;

    public List<AutomationDTO> findAutomationDetail(Long patientId) {
        return automationClient.findAutomationDetail(patientId);
    }
}
