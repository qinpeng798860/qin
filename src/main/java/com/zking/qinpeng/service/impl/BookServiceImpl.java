package com.zking.qinpeng.service.impl;

import com.zking.qinpeng.mapper.BookMapper;
import com.zking.qinpeng.model.Book;
import com.zking.qinpeng.service.IBookService;
import com.zking.qinpeng.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Book> queryBookPager(Book book, PageBean bean) {
        return bookMapper.queryBookPager(book);
    }
}
