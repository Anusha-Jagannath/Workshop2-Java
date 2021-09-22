package com.design;


import com.design.News.NewsType;

public class Main {
    public static void main(String args[]) {
        AajTak subject = new AajTak();
		News data = new News();
		NewChannelFactory newsChannelFactory = new NewChannelFactory();
		Observer observer1  = newsChannelFactory.getNewsChannelMethod(NewsType.MUMBAI_NEWS);
		Observer observer2  = newsChannelFactory.getNewsChannelMethod(NewsType.DELHI_NEWS);
		Observer observer3  = newsChannelFactory.getNewsChannelMethod(NewsType.BUSINESS_NEWS);
		
		
		data.setNews("Heavy rain in mumbai");
		data.setNewsType(NewsType.MUMBAI_NEWS);
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.update(data);
    }
}