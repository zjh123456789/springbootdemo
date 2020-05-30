package com.zjh.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 学生 model
 *
 * @author  jinghui.zhu
 * @date    2018/11/6 16:01
 */
@Data
public class Student {

    /**
     * 唯一ID
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

}
