package com.example.customer;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

  private final CustomerRepository customerRepository;

  public void registerCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .build();

    customerRepository.save(customer);
  }
}
