package com.example.Notification_Publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationPublisherController {
	
	 @Autowired
	    KafkaTemplate<String, String> template;
	 
	 @PostMapping("/create-ticket/{type}")
	    public void createTickets(@RequestBody() String tickets, @PathVariable("type") String type) {
	        switch (type.toLowerCase()) {
	            case "technicalIssues":
	                template.send("technical-issues", tickets);
	                break;
	            case "accountManagement":
	                template.send("account-management", tickets);
	                break;
	            case "billingAndPayments":
	                template.send("billing-payments", tickets);
	                break;
	            case "OrderstatusTracking":
	                template.send("order-tracking", tickets);
	                break;
	                
	            case "productServicesInfo":
	                template.send("product-services-info", tickets);
	                break;
	            case "others":
	                template.send("others", tickets);
	                break;
	        }

}
}
