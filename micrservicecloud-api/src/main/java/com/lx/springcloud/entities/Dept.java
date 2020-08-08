package com.lx.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor//全参
@NoArgsConstructor//空参
@Data//get set
@Accessors(chain = true)//链式风格访问
public class Dept {
    private Long deptno;
    private String dname;
    private String db_source;

}
