package com.zking.qinpeng.mapper;

import com.zking.qinpeng.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    List<Category> queryCategory(int cid);
}