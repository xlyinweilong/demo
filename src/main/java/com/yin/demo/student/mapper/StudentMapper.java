package com.yin.demo.student.mapper;

import com.yin.demo.student.entity.po.StudentPo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生mapper
 *
 * @author yin.weilong
 * @date 2018.04.17
 */
@Repository
public interface StudentMapper {

    List<StudentPo> findAll();


    @Select("SELECT id,name,login_name as loginName FROM student")
//    @Results({
//            @Result(property = "id", column = "id")
//    })
    List<StudentPo> getAll();
}
