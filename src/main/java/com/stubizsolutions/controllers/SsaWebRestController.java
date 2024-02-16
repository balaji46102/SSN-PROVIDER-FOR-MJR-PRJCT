package com.stubizsolutions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stubizsolutions.bindings.SsaWebRequest;
import com.stubizsolutions.bindings.SsaWebResponse;
import com.stubizsolutions.services.SsaWebService;

@RestController
public class SsaWebRestController 
{
	@Autowired
	private SsaWebService service;
	
	@PostMapping("/ssa")
	public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest req) 
	{
		return service.getCitizenInfo(req);
	}

}
