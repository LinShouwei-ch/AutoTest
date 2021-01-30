package com.course.testng.thread;

import org.testng.annotations.Test;

public class ThreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test01(){
        System.out.println(1);
        System.out.print("Thread id:"+Thread.currentThread().getId());
    }
}
