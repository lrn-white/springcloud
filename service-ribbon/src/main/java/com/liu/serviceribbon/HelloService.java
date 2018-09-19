package com.liu.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lrn
 * @createTime : 2018/9/6 17:27
 * @updateTime :
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-SERVER/hi?name="+name,String.class);
    }
}
