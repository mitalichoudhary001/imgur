package com.syf.imgur.test.rest.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class UploadDataBean implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private Object title;
    private Object description;
    private int datetime;
    private String type;
    private boolean animated;
    private int width;
    private int height;
    private int size;
    private int views;
    private int bandwidth;
    private Object vote;
    private boolean favorite;
    private boolean nsfw;
    private Object section;
    private Object account_url;
    private int account_id;
    private boolean is_ad;
    private boolean in_most_viral;
    private boolean has_sound;
    private ArrayList<Object> tags;
    private int ad_type;
    private String ad_url;
    private String edited;
    private boolean in_gallery;
    private String deletehash;
    private Object name;
    private String link;
    private AdConfigBean ad_config;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getDatetime() {
		return datetime;
	}
	public void setDatetime(int datetime) {
		this.datetime = datetime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAnimated() {
		return animated;
	}
	public void setAnimated(boolean animated) {
		this.animated = animated;
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
	public int getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}
	public Object getVote() {
		return vote;
	}
	public void setVote(Object vote) {
		this.vote = vote;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public boolean isNsfw() {
		return nsfw;
	}
	public void setNsfw(boolean nsfw) {
		this.nsfw = nsfw;
	}
	public Object getSection() {
		return section;
	}
	public void setSection(Object section) {
		this.section = section;
	}
	public Object getAccount_url() {
		return account_url;
	}
	public void setAccount_url(Object account_url) {
		this.account_url = account_url;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public boolean isIs_ad() {
		return is_ad;
	}
	public void setIs_ad(boolean is_ad) {
		this.is_ad = is_ad;
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
	public ArrayList<Object> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Object> tags) {
		this.tags = tags;
	}
	public int getAd_type() {
		return ad_type;
	}
	public void setAd_type(int ad_type) {
		this.ad_type = ad_type;
	}
	public String getAd_url() {
		return ad_url;
	}
	public void setAd_url(String ad_url) {
		this.ad_url = ad_url;
	}
	public String getEdited() {
		return edited;
	}
	public void setEdited(String edited) {
		this.edited = edited;
	}
	public boolean isIn_gallery() {
		return in_gallery;
	}
	public void setIn_gallery(boolean in_gallery) {
		this.in_gallery = in_gallery;
	}
	public String getDeletehash() {
		return deletehash;
	}
	public void setDeletehash(String deletehash) {
		this.deletehash = deletehash;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public AdConfigBean getAd_config() {
		return ad_config;
	}
	public void setAd_config(AdConfigBean ad_config) {
		this.ad_config = ad_config;
	}

    
    
}