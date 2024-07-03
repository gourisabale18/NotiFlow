package com.example.Notification_Publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class NotificationPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationPublisherApplication.class, args);
	}
		
		 @KafkaListener(id = "user", topics = { "technical-issues", "account-management"})
		 public void listen(String tickets) {
		  System.out.println("*******Tickets********");
		  System.out.println(tickets);
		 }
}
