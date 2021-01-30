package com.course.testng.thread;

import org.testng.annotations.Test;

public class ThreadOnXml {
    @Test
    public void test01(){
        System.out.println(1);
        System.out.print("Thread id:"+Thread.currentThread().getId());
    }
    @Test
    public void test02(){
        System.out.println(2);
        System.out.print("Thread id:"+Thread.currentThread().getId());
    }
    @Test
    public void test03(){
        System.out.println(3);
        System.out.print("Thread id:"+Thread.currentThread().getId());
    }
}
