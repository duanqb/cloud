package com.itcodai.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author duanqb
 * @date 2019/4/3 14:12
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Torder {

    private Long id;

    private String name;

    private Double price;

    private String dbSource;

}

