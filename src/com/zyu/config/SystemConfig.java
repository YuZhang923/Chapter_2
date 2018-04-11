package com.zyu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with IntelliJ IDEA.
 * User: z.yu
 * DateTime: 2018-04-11 11:14
 * Description: 总配置类
 */
@Configuration
@Import({SpringConfig.class})  // 导入java配置类
@ImportResource("classpath:spring.xml") // 导入xml配置文件
@ComponentScan(basePackages = {"com.zyu.*"}) // 注解扫描：默认扫描与配置类相同包及其子包
public class SystemConfig {

}
