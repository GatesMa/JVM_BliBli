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

    private Object instance;

    public TestGC() {
        byte[] b = new byte[2 * 1024 * 1024];
    }

    public static void main(String[] args) {
        TestGC m1 = new TestGC();
        TestGC m2 = new TestGC();
        m1.instance = m2;
        m2.instance = m1;
        m1 = null;
        m2 = null;
//        System.gc();
        
    }
}
