package com.itcodai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author duanqb
 * @date 2019/4/4 17:58
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class Server2Application {
    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
        log.info("启动成功");
    }

}
