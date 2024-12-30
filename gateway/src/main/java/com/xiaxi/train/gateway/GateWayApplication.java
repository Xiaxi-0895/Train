package com.xiaxi.train.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.xiaxi")
public class GateWayApplication {
    private static final Logger LOG = LoggerFactory.getLogger(GateWayApplication.class);

    public static void main(String[] args) {
        Environment environment = SpringApplication.run(GateWayApplication.class, args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("网关地址：http://localhost:{}", environment.getProperty("server.port"));
    }
}
