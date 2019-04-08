package com.itcodai;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author duanqb
 * @date 2019/4/3 15:40
 */
@SpringBootApplication
@MapperScan("com.*.dao")
@Slf4j
public class OrderProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderProviderApplication.class, args);
        log.info("启动成功");
    }
}
