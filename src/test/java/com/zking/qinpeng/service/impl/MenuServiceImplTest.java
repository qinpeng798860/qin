package com.zking.qinpeng.service.impl;

import com.zking.qinpeng.model.Menu;
import com.zking.qinpeng.service.IMenuService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class MenuServiceImplTest extends ServiceTestCase{

    @Autowired
    private IMenuService iMenuService;

    public void setUp(){
        super.setUp();
    }

    @Test
    public void queryMenuList() {
        List<Menu> menus =
                iMenuService.queryMenuList();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}