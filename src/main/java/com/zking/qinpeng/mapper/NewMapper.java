package com.zking.qinpeng.mapper;

import com.zking.qinpeng.model.New;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewMapper {

    List<New> queryNew(int nid);

}