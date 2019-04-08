package com.itcodai.service;

import com.itcodai.entity.Torder;

import java.util.List;

/**
 * The interface Order service.
 *
 * @author duanqb
 * @date 2019 /4/3 15:50
 */
public interface OrderService {

    Torder findById(Long id);

    List<Torder> findAll();
}
