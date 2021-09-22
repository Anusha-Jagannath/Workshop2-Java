package com.design;


import com.design.News.NewsType;

public class DelhiAajTak<T> implements Observer<T> {
    @Override
    public void onUpdate(T data) {
        if(data instanceof News) {
			System.out.println(((News)data).getNews());
		}
    }

	@Override
	public News.NewsType getRequiredNewsType() {
		return News.NewsType.DELHI_NEWS;
	}
}