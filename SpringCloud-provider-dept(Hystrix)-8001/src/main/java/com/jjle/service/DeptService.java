package com.jjle.service;

import com.jjle.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);
    Dept queryDeptById(Long id);
    List<Dept> queryAll();
}
