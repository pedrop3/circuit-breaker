package br.com.learn.circuitbreaker.feign;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.learn.circuitbreaker.controller.AutomationDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Component
@FeignClient(name = "autmationClient", 
    url = "http://localhost:8081"
    )
public interface AutomationClient {

  @CircuitBreaker(name = "automationCB", fallbackMethod = "findAutomationFallBack")
  @GetMapping(path = "/{patientId}", produces = MediaType.APPLICATION_JSON_VALUE)
  List<AutomationDTO> findAutomationDetail(@PathVariable Long patientId);


  default List<AutomationDTO> findAutomationFallBack(Throwable throwable) {
    return new ArrayList<>();
  }
  
}