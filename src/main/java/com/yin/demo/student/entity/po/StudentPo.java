package com.yin.demo.student.entity.po;


/**
 * 学生
 *
 * @author yin.weilong
 * @date 2018.04.17
 */
public class StudentPo {

    public Integer id;

    public String name;

    public String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
