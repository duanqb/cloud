package com.itcodai.service;

import com.itcodai.entity.Torder;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author duanqb
 * @date 2019/4/4 15:33
 */
@FeignClient(value = "microservice-order")
@RequestMapping("/provider/order")
public interface DescClient {

    /**
     *  FeignClient(value = "microservice-order")
     *  value—— 指明要访问的服务名称
     * @GetMapping(value = "")
      * value—— 要访问的服务中接口的名称
     */

    @GetMapping("/get/list")
    public List<Torder> getAll();


    @GetMapping("/get/{id}")
    public Torder getOrder(@PathVariable("id") Long id);

}
