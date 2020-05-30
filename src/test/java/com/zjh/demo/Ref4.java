package com.zjh.demo;

import java.util.Vector;

/**
 * @Author: JinghuiZhu
 * @Description:
 * @Date: Created in 16:50 2019/1/25
 * @Modified By:
 */
public class Ref4 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector(1,10);
        System.out.println("vector 长度 " + vector.capacity());
        vector.add("ab");
        System.out.println("vector 长度 " + vector.capacity());
        vector.add("teacher");
        System.out.println("vector 长度 " + vector.capacity());
        vector.add("student");
        System.out.println("vector 长度 " + vector.capacity());
        System.out.println(vector.get(5));
        System.out.println(vector);
    }
}
