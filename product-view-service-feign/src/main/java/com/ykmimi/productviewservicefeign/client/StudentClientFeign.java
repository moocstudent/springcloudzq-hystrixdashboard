package com.ykmimi.productviewservicefeign.client;

import com.ykmimi.productviewservicefeign.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback=StudentClientFeignHystrix.class)
public interface StudentClientFeign {

    @GetMapping("/students")
    public List<Student> listStudent();
}
