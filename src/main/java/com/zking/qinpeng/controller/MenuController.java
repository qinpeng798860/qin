package com.zking.qinpeng.controller;

import com.zking.qinpeng.model.Menu;
import com.zking.qinpeng.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@RequestMapping("menu")
@Controller
public class MenuController {

    @Autowired
    private IMenuService iMenuService;

    /**
     * 查询模块信息
     * @return
     */
    @RequestMapping("queryMenu")
    @ResponseBody
    public List<Menu> queryMenu(){
        List<Menu> menus = iMenuService.queryMenuList();

        return menus;
    }
}
