package com.ykmimi.productviewservicefeign.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

public class AccessViewService {

    public static void accessStudents() {

        while(true){
            ThreadUtil.sleep(1000);
            try {
                String html = HttpUtil.get("http://127.0.0.1:8012/students");
                System.out.println("html length:" + html.length());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
