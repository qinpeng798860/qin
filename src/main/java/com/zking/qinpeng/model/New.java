package com.zking.qinpeng.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class New implements Serializable {
    private Integer newsId;

    private String title;

    private List<Category> categoryList;

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public New(Integer newsId, String title) {
        this.newsId = newsId;
        this.title = title;
    }

    public New() {
        super();
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}