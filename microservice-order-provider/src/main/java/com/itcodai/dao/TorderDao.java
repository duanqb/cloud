package com.itcodai.dao;

import com.itcodai.entity.Torder;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author duanqb
 * @date 2019/4/3 15:39
 */
public interface TorderDao {

    @Select("select * from t_order where id = #{id}")
    Torder findById(Long id);

    @Select("select * from t_order")
    List<Torder> findAll();
}
