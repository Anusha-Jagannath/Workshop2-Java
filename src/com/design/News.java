package com.design;


public class News {

	public static enum NewsType {
		MUMBAI_NEWS, DELHI_NEWS, BUSINESS_NEWS
	}

	private String news;
	private NewsType newsType;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public NewsType getNewsType() {
		return newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

	@Override
	public String toString() {
		return "Data [data=" + news + "]";
	}
}