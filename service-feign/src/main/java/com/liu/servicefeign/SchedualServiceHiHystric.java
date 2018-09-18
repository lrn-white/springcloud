package com.liu.servicefeign;

import org.springframework.stereotype.Component;

/**
 * 断路器设置提示语
 * @author lrn
 * @createTime : 2018/9/18 14:41
 * @updateTime :
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
