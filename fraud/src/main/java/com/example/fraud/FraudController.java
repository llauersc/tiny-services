package com.example.fraud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {
  
  private final FraudCheckService fraudCheckService;

  @GetMapping("{customerId}")
  public FraudCheckResponse isFraud(@PathVariable("customerId") Long customerId) {
    boolean isFraud = fraudCheckService.isFraudCustomer(customerId);

    return new FraudCheckResponse(isFraud);
  }
}
