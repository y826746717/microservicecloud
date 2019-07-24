package com.yang.springcloud8072.dao;

import com.yang.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public Dept findById(long deptno);

    public List<Dept> findAll();

    public boolean addDept(Dept dept);
}
