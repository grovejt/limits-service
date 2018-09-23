package com.grove.microservices.limitsservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grove.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		
		logger.info("retrieveLimitsFromConfigurations called");
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
