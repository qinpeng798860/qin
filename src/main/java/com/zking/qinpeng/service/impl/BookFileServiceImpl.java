package com.zking.qinpeng.service.impl;

import com.zking.qinpeng.mapper.BookFileMapper;
import com.zking.qinpeng.model.BookFile;
import com.zking.qinpeng.service.IBookFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookFileServiceImpl implements IBookFileService {
    @Autowired
    private BookFileMapper bookFileMapper;

    @Override
    public int insert(BookFile record) {
        return bookFileMapper.insert(record);
    }

    @Override
    public BookFile selectByPrimaryKey(String fileId) {
        return bookFileMapper.selectByPrimaryKey(fileId);
    }

}
