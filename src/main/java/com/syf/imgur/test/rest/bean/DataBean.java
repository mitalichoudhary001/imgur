package com.syf.imgur.test.rest.bean;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DataBean implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private String deletehash;
    private int account_id;
    private String account_url;
    private Object ad_type;
    private Object ad_url;
    private Object title;
    private Object description;
    private String name;
    private String type;
    private int width;
    private int height;
    private int size;
    private int views;
    private Object section;
    private Object vote;
    private int bandwidth;
    private boolean animated;
    private boolean favorite;
    private boolean in_gallery;
    private boolean in_most_viral;
    private boolean has_sound;
    private boolean is_ad;
    private Object nsfw;
    private String link;
    private ArrayList<Object> tags;
    private int datetime;
    private String mp4;
    private String hls;
    
 
    public String edited;

    public AdConfigBean ad_config;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeletehash() {
		return deletehash;
	}
	public void setDeletehash(String deletehash) {
		this.deletehash = deletehash;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getAccount_url() {
		return account_url;
	}
	public void setAccount_url(String account_url) {
		this.account_url = account_url;
	}
	public Object getAd_type() {
		return ad_type;
	}
	public void setAd_type(Object ad_type) {
		this.ad_type = ad_type;
	}
	public Object getAd_url() {
		return ad_url;
	}
	public void setAd_url(Object ad_url) {
		this.ad_url = ad_url;
	}
	public Object getTitle() {
		return title;
	}
	public void setTitle(Object title) {
		this.title = title;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public Object getSection() {
		return section;
	}
	public void setSection(Object section) {
		this.section = section;
	}
	public Object getVote() {
		return vote;
	}
	public void setVote(Object vote) {
		this.vote = vote;
	}
	public int getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}
	public boolean isAnimated() {
		return animated;
	}
	public void setAnimated(boolean animated) {
		this.animated = animated;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public boolean isIn_gallery() {
		return in_gallery;
	}
	public void setIn_gallery(boolean in_gallery) {
		this.in_gallery = in_gallery;
	}
	public boolean isIn_most_viral() {
		return in_most_viral;
	}
	public void setIn_most_viral(boolean in_most_viral) {
		this.in_most_viral = in_most_viral;
	}
	public boolean isHas_sound() {
		return has_sound;
	}
	public void setHas_sound(boolean has_sound) {
		this.has_sound = has_sound;
	}
	public boolean isIs_ad() {
		return is_ad;
	}
	public void setIs_ad(boolean is_ad) {
		this.is_ad = is_ad;
	}
	public Object getNsfw() {
		return nsfw;
	}
	public void setNsfw(Object nsfw) {
		this.nsfw = nsfw;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public ArrayList<Object> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Object> tags) {
		this.tags = tags;
	}
	public int getDatetime() {
		return datetime;
	}
	public void setDatetime(int datetime) {
		this.datetime = datetime;
	}
	public String getMp4() {
		return mp4;
	}
	public void setMp4(String mp4) {
		this.mp4 = mp4;
	}
	public String getHls() {
		return hls;
	}
	public void setHls(String hls) {
		this.hls = hls;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    
    
}