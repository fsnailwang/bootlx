package com.github.zywx.bootlearn.service.impl;

import com.github.zywx.bootlearn.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * A simple class desc
 *
 * author fsnail.wang@gmail.com
 * date 2018/2/10 下午6:13
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String demo() {
        return "Hello Springboot demo";
    }
}
