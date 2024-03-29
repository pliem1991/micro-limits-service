package com.liempt.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liempt.microservices.limitsservice.bean.LimitConfiguration;

/**
 * @author Liem.pt - 2019/03/15 14:23:33
 *
 */
@RestController
public class LimitsConfigurationController {

	@GetMapping("/limits")
	public LimitConfiguration retrievelLitmitsFromConfigurations() {
		return new LimitConfiguration(1000, 1);
	}

}
