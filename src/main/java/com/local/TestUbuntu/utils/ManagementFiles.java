package com.local.TestUbuntu.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ManagementFiles {
	
	private static final Logger LOG = LogManager.getLogger(ManagementFiles.class);
	
	private boolean createFile(String directory, String fileName, String extension) {
		File file = new File(directory + fileName);
		try {
			if(file.createNewFile()) {
				LOG.info("File created successfully");
			}else {
				LOG.info("The file already exists");
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean writeFile(String directory, String fileName, String extension,String description) {
		if(createFile(directory, fileName, extension)) {		
			try {
				FileWriter writer = new FileWriter(directory + fileName);
				writer.write(description);
				writer.close();
				LOG.info("The file was wrote successfully and saved");
				return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		return false;
	}

	
	
}
