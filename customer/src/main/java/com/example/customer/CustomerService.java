package com.example.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

  private final CustomerRepository customerRepository;
  private final RestTemplate restTemplate;

  public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .build();

    customerRepository.saveAndFlush(customer);

    FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
      "http://localhost:8081/api/v1/fraud-check/{customerId}",
      FraudCheckResponse.class,
      customer.getId()
    );

    if(fraudCheckResponse.getIsFraud()) {
      throw new IllegalStateException("Customer is fraud");
    }
  }
}
