package com.zking.qinpeng.service.impl;

import com.zking.qinpeng.mapper.CategoryMapper;
import com.zking.qinpeng.model.Category;
import com.zking.qinpeng.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> queryCategory(int cid) {
        return categoryMapper.queryCategory(cid);
    }
}
