package com.design;


import com.design.News.NewsType;

public class MumbaiAajTak<T> implements Observer<T>{
    @Override
    public void onUpdate(T data) {
        if(data instanceof News) {
			System.out.println(((News)data).getNews());
		}
    }

	@Override
	public NewsType getRequiredNewsType() {
		return News.NewsType.MUMBAI_NEWS;
	}
}