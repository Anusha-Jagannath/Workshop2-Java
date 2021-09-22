package com.design;


import com.design.News.NewsType;

public class NewChannelFactory {

	public Observer getNewsChannelMethod(News.NewsType channel) {

		switch (channel) {
		case MUMBAI_NEWS:
			return new MumbaiAajTak();
		case DELHI_NEWS:
			return new DelhiAajTak();
		case BUSINESS_NEWS:
			return new BusinessAajTak();
		}
		return null;
	}
}
