package com.xfs.learn.controller;

import com.xfs.learn.service.impl.HelloServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * A simple class desc
 * <p>
 * author fsnail.wang@gmail.com
 * date 2018/2/10 下午6:19
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Resource
    private HelloServiceImpl helloService;

    @RequestMapping("/index")
    public String index() {
        return helloService.demo();
    }

}
