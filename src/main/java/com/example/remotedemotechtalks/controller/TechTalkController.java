package com.example.remotedemotechtalks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechTalkController {

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String getByCountyLocal() {
		return "up app";
	}
}
