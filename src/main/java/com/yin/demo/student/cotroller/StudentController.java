package com.yin.demo.student.cotroller;

import com.yin.demo.student.entity.po.StudentPo;
import com.yin.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yin.weilong
 * @date 2018.04.17
 */

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/list", produces = {"application/json;charset=UTF-8"})
    public List<StudentPo> list() {
        return studentService.findAll();
    }
}
