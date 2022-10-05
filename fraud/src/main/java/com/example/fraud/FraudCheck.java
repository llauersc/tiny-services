package com.example.fraud;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheck {
  @Id @GeneratedValue
  private Long id;
  private Long customerId;
  private Boolean isFraud;
  private LocalDateTime createdAt;
}
