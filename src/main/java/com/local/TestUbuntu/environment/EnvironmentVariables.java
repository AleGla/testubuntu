package com.local.TestUbuntu.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentVariables{

	@Value("${directoryFiles}")
	private String directoryFiles;

	public String getDirectoryFiles() {
		return directoryFiles;
	}

	public void setDirectoryFiles(String directoryFiles) {
		this.directoryFiles = directoryFiles;
	}
	
	
	
	
}
