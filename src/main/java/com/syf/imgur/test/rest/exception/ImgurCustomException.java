package com.syf.imgur.test.rest.exception;

public class ImgurCustomException extends Exception{

	public ImgurCustomException(String error) {
		super(error);
	}
}