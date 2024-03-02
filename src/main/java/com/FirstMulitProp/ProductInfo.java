package com.FirstMulitProp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pi")
public class ProductInfo {
	@Value("${my.app.title}")
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "ProductInfo [title=" + title + "]";
	}
	
	

}
