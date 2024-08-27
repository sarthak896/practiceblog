package com.PracticeBlog.PracticeBlog.Dto;

public class PracticeDto {
	
	private long id;
	private String title;
	private String content;
	private String description;
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getDescription() {
		return description;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
