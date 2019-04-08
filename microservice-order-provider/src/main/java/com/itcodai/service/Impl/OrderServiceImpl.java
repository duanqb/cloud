package com.itcodai.service.Impl;

import com.itcodai.dao.TorderDao;
import com.itcodai.entity.Torder;
import com.itcodai.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duanqb
 * @date 2019/4/3 16:13
 */
@Service("orderService")
public class OrderServiceImpl  implements OrderService {

    @Resource
    private TorderDao torderDao;

    @Override
    public Torder findById(Long id) {
        return torderDao.findById(id);
    }

    @Override
    public List<Torder> findAll() {
        return torderDao.findAll();
    }
}
