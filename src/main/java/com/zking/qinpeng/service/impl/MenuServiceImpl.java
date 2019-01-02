package com.zking.qinpeng.service.impl;

import com.zking.qinpeng.mapper.MenuMapper;
import com.zking.qinpeng.model.Menu;
import com.zking.qinpeng.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> queryMenuList() {
        return menuMapper.queryMenuList();
    }
}
