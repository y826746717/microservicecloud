package com.yang.springcloud8072.service.impl;

import com.yang.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yang.springcloud8072.dao.DeptDao;
import com.yang.springcloud8072.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept getOne(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
