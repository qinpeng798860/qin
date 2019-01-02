package com.zking.qinpeng.controller;

import com.zking.qinpeng.model.Book;
import com.zking.qinpeng.service.IBookService;
import com.zking.qinpeng.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("book")
@Controller
public class BookController {

    @Autowired
    private IBookService iBookService;

    @RequestMapping("/queryBookList")
    public String queryBookList(Book book, PageBean bean,Model model) {
        List<Book> bookList = iBookService.queryBookPager(book, bean);
        model.addAttribute("bookList",bookList);

        return "/book/bookList";
    }


}
