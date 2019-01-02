package com.zking.qinpeng.service;

import com.zking.qinpeng.model.BookFile;

public interface IBookFileService {

    int insert(BookFile record);/*插入数据*/

    BookFile selectByPrimaryKey(String fileId);/*查询单个文件*/
}