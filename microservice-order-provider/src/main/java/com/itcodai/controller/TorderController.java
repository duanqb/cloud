package com.itcodai.controller;

import com.itcodai.entity.Torder;
import com.itcodai.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duanqb
 * @date 2019/4/3 15:46
 */

@RestController
@RequestMapping("/provider/order")
public class TorderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/get/{id}")
    public Torder getOrder(@PathVariable("id") Long id) {
        return orderService.findById(id);
    }

    @GetMapping("/get/list")
    public List<Torder> getAll() {
        return orderService.findAll();
    }

}
