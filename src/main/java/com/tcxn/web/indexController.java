package com.tcxn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页错误
 */
@Controller
public class indexController {
/*  日志测试未成功  控制台没有打印日志
    @GetMapping("/{id}/{name}")
    public  String index(@PathVariable Integer id,@PathVariable String name) {
//        int i = 9/0;
//        String blog = null;
//        if(blog == null) {
//            throw  new NotFoundException("博客不存在");
//        }
        System.out.println("-------index------");
        return "index";
    }*/


//    @ResponseBody
    @GetMapping("/")
    public  String index() {
//        int i = 9/0;
//        String blog = null;
//        if(blog == null) {
//            throw  new NotFoundException("博客不存在");
//        }
        return "index";
    }
}
