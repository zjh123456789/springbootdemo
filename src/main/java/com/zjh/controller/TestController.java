package com.zjh.controller;

import com.zjh.model.Id;
import com.zjh.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * postman 传参测试
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2020/5/30 13:24:30
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "getStudentById", method = RequestMethod.POST)
    public Student getStudent(@RequestBody Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("张楚岚");
        student.setAge(18);
        return student;
    }

    @RequestMapping(value = "xxx", method = RequestMethod.POST)
    public Student getStudent(@RequestBody Id id) {
        return new Student();
    }

    @RequestMapping(value = "listStudent", method = RequestMethod.POST)
    public Student getStudent(@RequestBody List<Integer> ids) {
        Student student = new Student();
        student.setId(3);
        student.setName("夏禾");
        student.setAge(18);
        return student;
    }

    @RequestMapping(value = "getStudentByName", method = RequestMethod.POST)
    public Student getStudentByName(@RequestBody Student student) {
        student.setAge(100);
        return student;
    }

    @RequestMapping(value = "batchUpdateStudent", method = RequestMethod.POST)
    public List<Student> getStudentByName(@RequestBody List<Student> students) {
        students.stream().forEach(item -> item.setAge(18));
        return students;
    }
}
