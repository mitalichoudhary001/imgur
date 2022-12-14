package com.syf.imgur.test.rest.bean;

import java.io.Serializable;

public class ViewImageResponseBean implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DataBean data;
    private boolean success;
    private int status;
	public DataBean getData() {
		return data;
	}
	public void setData(DataBean data) {
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