package com.example.demo;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;


/**
 * @Author: JinghuiZhu
 * @Description: Md 5 加密学习
 * @Date: Created in 11:44 2019/1/25
 * @Modified By:
 */
public class Md5 {

    public static void main(String[] args) {
        String password = "123";
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String algorithmName = "md5";
        String encodedPassword = new SimpleHash(algorithmName,password,salt,times).toString();

        System.out.printf("原始密码是 %s , 盐是： %s, 运算次数是： %d, 运算出来的密文是：%s ",password,salt,times,encodedPassword);
    }

}
