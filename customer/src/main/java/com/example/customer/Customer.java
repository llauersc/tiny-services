package com.example.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Customer {
  @Id
  @GeneratedValue
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
}
