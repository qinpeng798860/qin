package com.zking.qinpeng.mapper;

import com.zking.qinpeng.model.BookFile;

public interface BookFileMapper {

    int insert(BookFile record);

    BookFile selectByPrimaryKey(String fileId);


}