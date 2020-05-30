package com.example.demo;

import javax.persistence.*;

/**
 * @Description:     学生类实体, 在数据库生成一个student表
 * @Author:         Zhujinghui
 * @CreateDate:     2018/11/6 16:01
 */
@Entity
public class Student {

    /**
     * 代表唯一ID
     */
    @Id
    /**
     * 自增长
     */
    @GeneratedValue
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 空构造器必须
     */
    public Student() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
