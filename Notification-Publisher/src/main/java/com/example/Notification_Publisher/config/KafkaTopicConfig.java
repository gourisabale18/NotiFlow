package com.example.Notification_Publisher.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic technicalIssues()
	{
		return TopicBuilder.name("technical-issues").build();
	}
	
	@Bean
	public NewTopic accountManagement()
	{
		return TopicBuilder.name("account-management").build();
	}
	
	@Bean
	public NewTopic billingAndPayments()
	{
		return TopicBuilder.name("billing-payments").build();
	}
	
	@Bean
	public NewTopic OrderstatusTracking()
	{
		return TopicBuilder.name("order-tracking").build();
	}
	
	@Bean
	public NewTopic productServicesInfo()
	{
		return TopicBuilder.name("product-services-info").build();
	}
	
	@Bean
	public NewTopic others()
	{
		return TopicBuilder.name("others").build();
	}
	

}
