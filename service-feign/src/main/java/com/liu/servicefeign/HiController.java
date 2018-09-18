package com.liu.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lrn
 * @createTime : 2018/9/6 20:09
 * @updateTime :
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public Map<String, Object> sayHi(Student student) throws Exception {
        return schedualServiceHi.sayHiFromClientOne(student);
    }
}
