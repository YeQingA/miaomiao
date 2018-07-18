package com.pubhome.miaomiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: WangYan
 * @Date: 2018/7/18 10:36
 * @Description:
 */
@RestController
@RequestMapping("cat")
public class CatController {
    @RequestMapping("test")
    public String getMessage(){
        return  "helloworld";
    }
}
