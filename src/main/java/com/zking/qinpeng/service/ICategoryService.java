package com.zking.qinpeng.service;

import com.zking.qinpeng.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> queryCategory(int cid);
}