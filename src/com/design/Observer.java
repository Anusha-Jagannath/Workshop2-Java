package com.design;


import com.design.News.NewsType;

public interface Observer<T> {
    public void onUpdate(T data);
    
    public NewsType getRequiredNewsType();
}