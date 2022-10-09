package com.example.notification;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {
  private final NotificationRepository notificationRepository;

  public void send(NotificationRequest notificationRequest) {
    notificationRepository.save(
        Notification.builder()
            .toCustomerId(notificationRequest.getToCustomerId())
            .toCustomerEmail(notificationRequest.getToCustomerName())
            .sender("llauersc")
            .message(notificationRequest.getMessage())
            .sentAt(LocalDateTime.now())
            .build());
  }
}
