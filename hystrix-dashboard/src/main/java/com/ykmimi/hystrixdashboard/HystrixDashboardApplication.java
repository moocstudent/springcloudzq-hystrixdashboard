package com.ykmimi.hystrixdashboard;

import com.ykmimi.utilsboot.utils.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        int port = PortUtil.setPort(0, "默认端口8020", 8020);
        new SpringApplicationBuilder(HystrixDashboardApplication.class).properties("server.port="+port).run(args);
    }

}
