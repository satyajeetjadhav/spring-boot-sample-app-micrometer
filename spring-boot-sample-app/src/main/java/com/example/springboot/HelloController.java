package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import io.prometheus.client.exporter.common.TextFormat;


@RestController
public class HelloController {
    // PrometheusMeterRegistry prometheusRegistry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);


	@GetMapping("/")
	public String index() {
        // String response = prometheusRegistry.scrape(TextFormat.CONTENT_TYPE_OPENMETRICS_100);
		return "Greetings from Spring Boot!";
	}

    @GetMapping("/five")
	public String return500() {
        // String response = prometheusRegistry.scrape(TextFormat.CONTENT_TYPE_OPENMETRICS_100);
        throw new RuntimeException("500");
		//return "Greetings from Spring Boot!";
	}

}