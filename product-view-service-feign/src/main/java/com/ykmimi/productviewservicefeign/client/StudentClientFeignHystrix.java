package com.ykmimi.productviewservicefeign.client;

import com.ykmimi.productviewservicefeign.bean.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentClientFeignHystrix implements StudentClientFeign{

    public List<Student> listStudent() {
        List<Student> result = new ArrayList<>();
        result.add(new Student(0,"数据微服务不可用",0,"","",""));
        return result;
    }
}
