package com.ykmimi.productviewservicefeign;

import brave.sampler.Sampler;
import cn.hutool.core.util.NetUtil;
import com.ykmimi.productviewservicefeign.util.AccessViewService;
import com.ykmimi.utilsboot.utils.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@EnableEurekaClient
@EnableFeignClients
@SpringCloudApplication
public class ProductViewServiceFeignApplication {

    public static void main(String[] args) {
        int rabbitMQPort = 5672;
        if(NetUtil.isUsableLocalPort(rabbitMQPort)){
            System.err.printf("未在端口%d 发现rabbitMQ服务,请检查rabbitMQ是否启动",rabbitMQPort);
            System.exit(1);
        }

        int port = 0;
        port = PortUtil.setPort(0, "请输入ProductViewServiceFeignApplication的端口号,推荐8012.", 8012);
        new SpringApplicationBuilder(ProductViewServiceFeignApplication.class).properties("server.port=" + port).run(args);
        //页面持续访问,用于断路器监控
        AccessViewService.accessStudents();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}
