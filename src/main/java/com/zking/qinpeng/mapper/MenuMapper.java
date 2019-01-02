package com.zking.qinpeng.mapper;

import com.zking.qinpeng.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
        int deleteByPrimaryKey(Integer fid);

        int insert(Menu record);

        int insertSelective(Menu record);

        Menu selectByPrimaryKey(Integer fid);

        int updateByPrimaryKeySelective(Menu record);

        int updateByPrimaryKey(Menu record);

        List<Menu> queryMenuList();
}