package com.ykmimi.configserver;

import com.ykmimi.utilsboot.utils.PortUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        int port = PortUtil.setPort(0,"8030端口",8030);
        new SpringApplicationBuilder(ConfigServerApplication.class).properties("server.port="+port).run(args);
    }

}
