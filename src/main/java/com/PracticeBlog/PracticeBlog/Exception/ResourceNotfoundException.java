package com.PracticeBlog.PracticeBlog.Exception;

public class ResourceNotfoundException extends RuntimeException{
	
	private String resourcename;
	private String fieldname;
	private long fieldvalue;
	public ResourceNotfoundException(String resourcename, String fieldname, long fieldvalue) {
		super(String.format("%s resouce not found %s : %s",resourcename,fieldname,fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	public String getResourcename() {
		return resourcename;
	}
	public String getFieldname() {
		return fieldname;
	}
	public long getFieldvalue() {
		return fieldvalue;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public void setFieldvalue(long fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	
	

}
