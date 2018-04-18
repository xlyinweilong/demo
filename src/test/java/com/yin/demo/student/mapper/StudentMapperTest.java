package com.yin.demo.student.mapper;

import com.yin.demo.student.entity.po.StudentPo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yin.weilong
 * @date 2018.04.18
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void findAll() throws Exception {
        List<StudentPo> list = studentMapper.findAll();
        Assert.assertTrue(list != null);
    }

    @Test
    public void getAll() throws Exception {
        List<StudentPo> list = studentMapper.getAll();
        Assert.assertTrue(list != null);
    }

}
