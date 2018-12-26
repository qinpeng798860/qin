package com.zking.qinpeng.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Test {

    /*1、requestHeader*/
    @RequestMapping(value="test",method=RequestMethod.POST)
    public String test(@RequestHeader("User-Agent") @RequestParam String sex) {
        System.out.println(sex+"---------------------------------------------------------");
        return "index";
    }

    /**/
    //通过@requestBody可以将请求体中的JSON字符串绑定到相应的bean上
    // ，当然，也可以将其分别绑定到对应的字符串上。
    /*2、@RequestBody*/
    //　$.ajax({
    //　　　　　　　　url:"/login",
    //　　　　　　　　type:"POST",
    //　　　　　　　　data:'{"userName":"admin","pwd","admin123"}',
    //　　　　　　　　content-type:"application/json charset=utf-8",
    //　　　　　　　　success:function(data){
    //　　　　　　　　　　alert("request success ! ");
    //　　　　　　　　}
    //　　　　});
    //
    //　　　　@requestMapping("/login")
    //　　　　public void login(@requestBody String userName,@requestBody String pwd){
    //　　　　　　System.out.println(userName+" ："+pwd);
    //　　　　}
    @RequestMapping("test2")
    public String test2(@RequestBody String sex ) {
        System.out.println(sex+"---------------------------------------------------------");
        return "index";
    }


    //1、
    //
    //　　@responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，写入到response对象的body区，通常用来返回JSON数据或者是XML
    //
    //　　数据，需要注意的呢，在使用此注解之后不会再走试图处理器，而是直接将数据写入到输入流中，他的效果等同于通过response对象输出指定格式的数据。
    //
    //2、　　
    //
    //　　@RequestMapping("/login")
    //　　@ResponseBody
    //　　public User login(User user){
    //　　　　return user;
    //　　}
    //　　User字段：userName pwd
    //　　那么在前台接收到的数据为：'{"userName":"xxx","pwd":"xxx"}'
    //
    //　　效果等同于如下代码：
    //　　@RequestMapping("/login")
    //　　public void login(User user, HttpServletResponse response){
    //　　　　response.getWriter.write(JSONObject.fromObject(user).toString());
    //　　}

    @RequestMapping("test3")
    @ResponseBody
    public String test3(String sex ) {
        System.out.println(sex+"---------------------------------------------------------");
        return "index";
    }
    //
    //@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="不允许访问")
    @RequestMapping("test4")
    @ResponseStatus(value= HttpStatus.FORBIDDEN,reason="不允许访问")
    public String test4(String sex ) {
        System.out.println(sex+"---------------------------------------------------------");
        return "index";
    }   //

    //@PathVariable("id")
    @RequestMapping("/test5/{sex}")
    public String test5(@PathVariable("sex")String sex, Model model) {
        model.addAttribute("params", sex);
        System.out.println(sex+"---------------------------------------------------------");
        return "index";
    }
}
