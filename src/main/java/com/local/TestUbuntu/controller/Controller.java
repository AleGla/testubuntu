package com.local.TestUbuntu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.local.TestUbuntu.environment.EnvironmentVariables;
import com.local.TestUbuntu.models.File;
import com.local.TestUbuntu.models.ResponseService;
import com.local.TestUbuntu.utils.ManagementFiles;

@RestController
public class Controller {	
	
	private static final Logger LOG = LogManager.getLogger(Controller.class);
	
	@Autowired
	ObjectMapper objMapper;
	
	@Autowired
	EnvironmentVariables envVariables;
	
		
	@GetMapping(path = "echo")
	public String echo() {
		LOG.info("Somebody used this endpoint to know if the service is working");
		return "The service is working";
	}
	
	@PostMapping(path = "create/file", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> createFile(@RequestBody File file) throws JsonProcessingException {
		ManagementFiles mgFiles = new ManagementFiles();
		LOG.info("VAR: " + envVariables.getDirectoryFiles());
		if(mgFiles.writeFile(envVariables.getDirectoryFiles(), file.getName(), file.getExtension(), file.getDescription())) {
			return new ResponseEntity<String>(objMapper.writeValueAsString(new ResponseService("201","OK", null, "The file has been created, wrote and saved successfully")), HttpStatus.CREATED);
		}		
		return new ResponseEntity<String>(objMapper.writeValueAsString(new ResponseService("204", "ERROR", null, "There was a problem")), HttpStatus.NO_CONTENT);
	}
}
