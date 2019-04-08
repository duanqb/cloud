package com.itcodai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author duanqb
 * @date 2019/4/3 18:21
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate template = new RestTemplate();
        System.out.println(template);
        return  template;
    }
}
