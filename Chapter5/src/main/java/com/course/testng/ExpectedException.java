package com.course.testng;

import org.testng.annotations.Test;

//在期望结果为一个异常的时候，就用异常处理
public class ExpectedException {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectedException(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectedSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
