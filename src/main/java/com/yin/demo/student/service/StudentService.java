package com.yin.demo.student.service;

import com.yin.demo.student.entity.po.StudentPo;
import com.yin.demo.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生服务
 *
 * @author yin.weilong
 * @date 2018.04.17
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<StudentPo> findAll(){
//        return studentMapper.getAll();
        return studentMapper.findAll();
    }
}
