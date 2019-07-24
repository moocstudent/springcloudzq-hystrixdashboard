package com.ykmimi.productdataservice;

import brave.sampler.Sampler;
import com.ykmimi.utilsboot.utils.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProductDataServiceApplication {

    public static void main(String[] args) {
        int port = PortUtil.setPort(3, "请输入ProductDataServiceApplication的端口号,推荐8001,8002,8003.", 8001);
        new SpringApplicationBuilder(ProductDataServiceApplication.class).properties("server.port="+port).run(args);
    }
    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

}
