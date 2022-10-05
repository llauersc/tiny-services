package com.example.fraud;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FraudCheckService {

  private final FraudCheckRepository fraudCheckRepository;
  
  public boolean isFraudCustomer(Long customerId) {
    fraudCheckRepository.save(
      FraudCheck.builder()
        .customerId(customerId)
        .isFraud(false)
        .createdAt(LocalDateTime.now())
        .build()
    );
    return false;
  }
}
