package com.zking.qinpeng.service;

import com.zking.qinpeng.model.Book;
import com.zking.qinpeng.util.PageBean;

import java.util.List;

public interface IBookService {

    int insert(Book record);/*插入书籍*/

    int updateByPrimaryKey(Book record);/*保存书籍图片*/

    List<Book> queryBookPager(Book book, PageBean bean);
}