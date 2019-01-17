package com.zq.springboot.redis.distributesessiondemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
/*实现分布式session共享用spring session 集成 redis的技术后就两步，一是导入spring-session-data-redis二是配置spring session
配置springsession的目的就是让session写到redis中实现session共享*/

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)//session失效时间
public class SessionConfig {

}