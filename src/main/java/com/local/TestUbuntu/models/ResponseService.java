package com.local.TestUbuntu.models;

public class ResponseService {
	private String code;
	private String status;
	private String data;
	private String description;
	
	public ResponseService(String code, String status, String data, String description) {
		super();
		this.code = code;
		this.status = status;
		this.data = data;
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "{'code':" + code + ", 'status':" + status + ", 'data':" + data + ", 'description':"
				+ description + "}";
	}
	
	
	
}
