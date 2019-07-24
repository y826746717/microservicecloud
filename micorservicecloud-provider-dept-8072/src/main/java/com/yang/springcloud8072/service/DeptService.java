package com.yang.springcloud8072.service;

import com.yang.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean add(Dept dept);

    public Dept getOne(Long id);

    public List<Dept> list();
}
