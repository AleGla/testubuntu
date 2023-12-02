package com.local.TestUbuntu.models;

public class File {

	private String name;
	private String extension;
	private String description;
	
	public File() {}
	
	public File(String name, String extension, String description) {
		super();
		this.name = name;
		this.extension = extension;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
