package com.diegohipolito05.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timpestamp;
	private Integer status;
	private String error;
	private String messege;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Instant timpestamp, Integer status, String error, String messege, String path) {
		this.timpestamp = timpestamp;
		this.status = status;
		this.error = error;
		this.messege = messege;
		this.path = path;
	}

	public Instant getTimpestamp() {
		return timpestamp;
	}

	public void setTimpestamp(Instant timpestamp) {
		this.timpestamp = timpestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
