package com.zking.qinpeng.mapper;

import com.zking.qinpeng.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    int insert(Book record);/*插入书籍*/

    int updateByPrimaryKey(Book record);/*保存书籍图片*/

    List<Book> queryBookPager(Book book);
}