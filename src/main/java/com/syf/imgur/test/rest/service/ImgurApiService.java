package com.syf.imgur.test.rest.service;

import com.syf.imgur.test.rest.bean.DeleteResponseBean;
import com.syf.imgur.test.rest.bean.UploadResponseBean;
import com.syf.imgur.test.rest.bean.ViewImageResponseBean;
import com.syf.imgur.test.rest.bean.ViewListOfImageResponseBean;

public interface ImgurApiService {
	
	public ViewImageResponseBean getImage(String imageHash);
	public ViewListOfImageResponseBean getImages();
	public DeleteResponseBean deleteImage(String imageHash);
	public UploadResponseBean uploadImage(String image);
}
