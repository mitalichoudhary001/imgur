package com.syf.imgur.test.rest.bean;

import java.io.Serializable;

public class DeleteResponseBean implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean data;
    private boolean success;
    private int status;
    private boolean isData() {
		return data;
	}
	public void setData(boolean data) {
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
    
}