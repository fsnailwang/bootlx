package com.github.zywx.bootlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 配置类，springboot启动会自动加载此类
 *
 * author fsnail.wang@gmail.com
 * date 2018/2/10 下午6:31
 */
@Configuration
@ImportResource(locations={"classpath:spring/application-bean.xml"})
public class BootConfig {
}
