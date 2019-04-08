package com.itcodai.controller;

import com.itcodai.entity.Torder;
import com.itcodai.service.DescClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duanqb
 * @date 2019/4/3 19:48
 */
@RestController
@RequestMapping("/consumer/order")
public class ConsumerController {

    @Resource
    private DescClient descClient;

    @GetMapping("/get/list")
    public List getAll() {
        return descClient.getAll();
    }

    @GetMapping("get/{id}")
    public Torder getOrder(@PathVariable("id") Long id) {
        return descClient.getOrder(id);
    }

}
