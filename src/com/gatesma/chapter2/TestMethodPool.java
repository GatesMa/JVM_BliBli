package com.gatesma.chapter2;

/**
 * Copyright (C), 2020
 * FileName: TestMethodPool
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/18 11:06
 * Description:
 */
public class TestMethodPool {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        String s4 = s1 + "d";
        String s5 = "abcd";
        System.out.println(s4.intern() == s5);
    }
    
}
