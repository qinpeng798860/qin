package com.zking.qinpeng.mapper;

import com.zking.qinpeng.model.Category;
import com.zking.qinpeng.model.New;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewCcategoryMapper {

    List<New> queryNewList(int nid);
    List<Category> queryCategoryList(int cid);
}