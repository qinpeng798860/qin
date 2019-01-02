    package com.zking.qinpeng.vo;

import com.zking.qinpeng.model.BookFile;
import org.springframework.web.multipart.MultipartFile;


public class BookFileVo extends BookFile {
        private   Integer id;
            private MultipartFile multipartFile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public BookFileVo() {
    }
}

