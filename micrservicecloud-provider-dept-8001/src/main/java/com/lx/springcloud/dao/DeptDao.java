package com.lx.springcloud.dao;

import com.lx.springcloud.entities.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 14:48
 * @description
 */
@Mapper
@Component
public interface DeptDao {

    /**
     * 插入
     * @param deptEntity
     *
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<DeptEntity> findAll();

}