package com.ykmimi.productviewservicefeign.controller;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/fresh")
public class FreshConfigController {

    @PostMapping("/freshConfig")
    public Object freshConfig(){
        int code = 0;
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json; charset=utf-8");
        String result = HttpUtil.createPost("http://localhost:8012/actuator/bus-refresh").addHeaders(headers).execute().body();
        System.out.println("result:"+result);
        if(result.equals("")){
            code= 1;
        }else if(result.length()>5){ //wrong message
            code= 0;
        }
        return code;
    }
}
