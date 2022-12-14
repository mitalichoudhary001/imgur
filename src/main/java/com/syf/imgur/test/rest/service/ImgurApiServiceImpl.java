package com.syf.imgur.test.rest.service;

import java.io.File;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.syf.imgur.test.rest.bean.DeleteResponseBean;
import com.syf.imgur.test.rest.bean.UploadResponseBean;
import com.syf.imgur.test.rest.bean.ViewImageResponseBean;
import com.syf.imgur.test.rest.bean.ViewListOfImageResponseBean;
import com.syf.imgur.test.rest.messaging.KafkaSender;
import com.syf.imgur.test.rest.util.CommonConstants;

@Service
public class ImgurApiServiceImpl implements ImgurApiService{

	public static Logger logger=org.slf4j.LoggerFactory.getLogger(ImgurApiServiceImpl.class);

	@Value("${com.syf.test.authorization.token}")
	private String authorizationToken;

	@Value("${com.syf.test.imgur.baseurl}")
	private String baseurl;

	@Value("${com.syf.test.imgur.get.image}")
	private String getImageURI;
	

	@Value("${com.syf.test.imgur.get.all.image}")
	private String getAllImageURI;
	@Value("${com.syf.test.imgur.delete}")
	private String deleteImageURI;
	
	@Value("${com.syf.test.imgur.upload}")
	private String uploadImageURL;
	
	@Autowired
	KafkaSender kafkaSender;

	/*
	 * This method is used to get Image based on Image id
	 */
	public ViewImageResponseBean getImage(String imageHash) {
		logger.info("ImgurApiServiceImpl getImage called imageHash:{}",imageHash);
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity httpEntity = new HttpEntity<>(getHeaders());
		ResponseEntity<ViewImageResponseBean> exchange = restTemplate.exchange(
				baseurl.concat(getImageURI).concat(imageHash), HttpMethod.GET, httpEntity,
				ViewImageResponseBean.class);
		logger.info("ImgurApiServiceImpl getImage method called statuscode:{}",exchange.getStatusCode());
		return exchange.getBody();
	}
	
	/*
	 * This method is used to all Images
	 */
	public ViewListOfImageResponseBean getImages() {
		logger.info("ImgurApiServiceImpl getImages called");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity httpEntity = new HttpEntity<>(getHeaders());
		ResponseEntity<ViewListOfImageResponseBean> exchange = restTemplate.exchange(
				baseurl.concat(getAllImageURI), HttpMethod.GET, httpEntity,
				ViewListOfImageResponseBean.class);
		logger.info("ImgurApiServiceImpl getImages method called statuscode:{}",exchange.getStatusCode());
		return exchange.getBody();
	}

	/*
	 * This method is used to Delete Image based on Image id
	 */
	public DeleteResponseBean deleteImage(String imageHash) {
		logger.info("ImgurApiServiceImpl deleteImage called imageHash:{}",imageHash);
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity httpEntity = new HttpEntity<>(getHeaders());
		ResponseEntity<DeleteResponseBean> deleteResponse = restTemplate.exchange(baseurl.concat(deleteImageURI).concat(imageHash),
				HttpMethod.DELETE, httpEntity, DeleteResponseBean.class);
		logger.info("ImgurApiServiceImpl deleteImage method called statuscode:{}",deleteResponse.getStatusCode());
		return deleteResponse.getBody();
	}
	/*
	 * This method is used to Upload Image based on image path
	 */
	public UploadResponseBean uploadImage(String imagePath){
		
		logger.info("ImgurApiServiceImpl uploadImage called imagePath:{}",imagePath);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new ByteArrayHttpMessageConverter());
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
		body.add(CommonConstants.IMAGE, new FileSystemResource(new File(imagePath)));
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, getHeaders());
		ResponseEntity<UploadResponseBean> uploadResponse = restTemplate.exchange(baseurl.concat(uploadImageURL),
				HttpMethod.POST, requestEntity, UploadResponseBean.class);
		logger.info("ImgurApiServiceImpl uploadImage method called statuscode:{}",uploadResponse.getStatusCode());
		kafkaSender.send(uploadResponse.getBody().getData().getId());
		return uploadResponse.getBody();
	}
	/*
	 * This method is used to get HttpHeaders
	 */
	private HttpHeaders getHeaders() {
	
		HttpHeaders headers = new HttpHeaders();
		headers.add(CommonConstants.AUTHORIZATION, CommonConstants.BEARER.concat(authorizationToken));
		return headers;
	}
}
