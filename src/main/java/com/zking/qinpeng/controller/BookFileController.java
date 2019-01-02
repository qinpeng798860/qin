package com.zking.qinpeng.controller;

import com.zking.qinpeng.model.Book;
import com.zking.qinpeng.model.BookFile;
import com.zking.qinpeng.service.IBookFileService;
import com.zking.qinpeng.service.IBookService;
import com.zking.qinpeng.vo.BookFileVo;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RequestMapping("upload")
@Controller
public class BookFileController {

    @Autowired
    private IBookFileService iBookFileService;

    @Autowired
    private IBookService iBookService;


    @RequestMapping("/fileUpload")
    public String fileUpload(@RequestParam Integer bookId, Model model){
        model.addAttribute("bookId", bookId);
        return "/book/uploadFile";
    }


    /**
     * 上传
     * @param bookFileVo
     * @param request
     * @return
     */
    @RequestMapping("/insertUpload")
    public String insertFile(BookFileVo bookFileVo, HttpServletRequest request) {
        try {
            MultipartFile multipartFile = bookFileVo.getMultipartFile();
            String contentType = multipartFile.getContentType();
            String filename = multipartFile.getOriginalFilename();
            String fileId = UUID.randomUUID().toString().replace("-", "");
            String realPath=request.getSession().getServletContext().getRealPath("/WEB-INF/upload/"+filename);
            System.out.println(realPath);
            BookFile bookFile = new BookFile();
            bookFile.setUrl(realPath);
            bookFile.setRealName(filename);
            bookFile.setFileId(fileId);
            bookFile.setContentType(contentType);
            iBookFileService.insert(bookFile);
            multipartFile.transferTo(new File(realPath));

            Book book = new Book();
            book.setId(bookFileVo.getId());
            book.setPhoto(fileId);
            iBookService.updateByPrimaryKey(book);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return "redirect:/book/queryBookList";
    }


    @RequestMapping("/download")
    public ResponseEntity<byte[]> downloadFile(@RequestParam String fileId) throws IOException {
        BookFile bookFile = iBookFileService.selectByPrimaryKey(fileId);
        //下载关键代码
        File file=new File(bookFile.getUrl());
        HttpHeaders headers = new HttpHeaders();//http头信息
        String downloadFileName = new String(bookFile.getRealName().getBytes("UTF-8"),"iso-8859-1");//设置编码
        headers.setContentDispositionFormData("attachment", downloadFileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }


}
