package com.zking.qinpeng.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class Category implements Serializable {
    private Integer categoryId;

    private String categoryName;

    private List<New> newList;

    public List<New> getNewList() {
        return newList;
    }

    public void setNewList(List<New> newList) {
        this.newList = newList;
    }

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {
        super();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}