package com.zking.qinpeng.service.impl;

import com.zking.qinpeng.mapper.NewMapper;
import com.zking.qinpeng.model.New;
import com.zking.qinpeng.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements INewService {
    @Autowired
    private NewMapper newMapper;
    @Override
    public List<New> queryNew(int nid) {
        return newMapper.queryNew(nid);
    }
}
