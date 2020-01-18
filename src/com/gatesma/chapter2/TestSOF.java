package com.gatesma.chapter2;

/**
 * Copyright (C), 2020
 * FileName: TestSOF
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/18 10:27
 * Description:
 */
public class TestSOF {

    public static void main(String[] args) {
        new TestSOF().test();
    }

    public void test() {
        System.out.println("递归");
        test();
    }

}
