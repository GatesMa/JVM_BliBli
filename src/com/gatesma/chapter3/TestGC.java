package com.gatesma.chapter3;

import com.sun.tools.javac.Main;

/**
 * Copyright (C), 2020
 * FileName: TestGC
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/18 12:56
 * Description:
 */
public class TestGC {

//    private Object instance;
//
    public static final int _1MB = 1024 * 1024;
//    public TestGC() {
//        byte[] b = new byte[2 * 1024 * 1024];
//    }

    public static void main(String[] args) {
//        TestGC m1 = new TestGC();
//        TestGC m2 = new TestGC();
//        m1.instance = m2;
//        m2.instance = m1;
//        m1 = null;
//        m2 = null;
        byte[] a1, a2, a3, a4;
        a1 = new byte[2 * _1MB];
        a2 = new byte[2 * _1MB];
        a3 = new byte[2 * _1MB];
        a4 = new byte[4 * _1MB];
//        System.gc();

    }
}
