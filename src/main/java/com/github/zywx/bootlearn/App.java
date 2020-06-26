package com.github.zywx.bootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * App 启动入口类
 * 启动方式：直接右键 run 即可
 * 访问测试：http://127.0.0.1:8080/hello/index
 *
 * author fsnail.wang@gmail.com
 * date 2018/2/10 下午6:13
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
