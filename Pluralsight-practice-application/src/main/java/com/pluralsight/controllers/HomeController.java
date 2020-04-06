package com.pluralsight.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
	@Value("${app.version}")
	private String appVersion;
	@GetMapping
	@RequestMapping("/api/v1")
	public Map<String, String> getStatus() {
		Map<String, String> map=new HashMap<String, String>();
		map.put("app-version", appVersion);
		return map;
	}

}
