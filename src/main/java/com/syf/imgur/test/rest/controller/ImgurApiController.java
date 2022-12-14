package com.syf.imgur.test.rest.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.syf.imgur.test.rest.bean.DeleteResponseBean;
import com.syf.imgur.test.rest.bean.UploadResponseBean;
import com.syf.imgur.test.rest.bean.ViewImageResponseBean;
import com.syf.imgur.test.rest.bean.ViewListOfImageResponseBean;
import com.syf.imgur.test.rest.exception.ImgurCustomException;
import com.syf.imgur.test.rest.service.ImgurApiService;

@RestController
public class ImgurApiController {

	public  Logger logger=org.slf4j.LoggerFactory.getLogger(ImgurApiController.class);
	@Autowired
	private ImgurApiService imgurApiService;

	@GetMapping("/image")
	public ViewImageResponseBean getImage(@RequestPart("imageHash") String imageHash) throws ImgurCustomException{
		logger.info("ImgurApiController getImage called imageHash:{}",imageHash);
		ViewImageResponseBean viewImageResponse = imgurApiService.getImage(imageHash);
		logger.info("ImgurApiController getImage method called statuscode:{}",viewImageResponse.toString());
		return viewImageResponse;
	}
	
	@GetMapping("/images")
	public ViewListOfImageResponseBean getImages() throws ImgurCustomException{
		logger.info("ImgurApiController getImages called");
		ViewListOfImageResponseBean viewListOfImageResponse = imgurApiService.getImages();
		logger.info("ImgurApiController getImages method called statuscode:{}",viewListOfImageResponse.toString());
		return viewListOfImageResponse;
	}

	@DeleteMapping("/delete")
	public DeleteResponseBean deleteImage(@RequestPart("imageHash") String imageHash) throws ImgurCustomException {
		logger.info("ImgurApiController deleteImage called imageHash:{}",imageHash);
		DeleteResponseBean deleteImage = imgurApiService.deleteImage(imageHash);
		logger.info("ImgurApiController deleteImage method called statuscode:{}",deleteImage.toString());
		return deleteImage;
	}

	@PostMapping("/upload")
	public UploadResponseBean uploadImage(@RequestPart("image") String imagePath) throws ImgurCustomException  {
		logger.info("ImgurApiController uploadImage called imagePath:{}",imagePath);
		UploadResponseBean uploadImage = imgurApiService.uploadImage(imagePath);
		logger.info("ImgurApiController uploadImage method called statuscode:{}",uploadImage.toString());
		return uploadImage;
	}
}


