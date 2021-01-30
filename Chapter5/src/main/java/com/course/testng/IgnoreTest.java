package com.course.testng;

import org.testng.annotations.Test;

//忽略测试
public class IgnoreTest {
    @Test
    public void ignore01(){
        System.out.println("ignore01执行");
    }
    //不执行这个方法
    @Test(enabled = false)
    public void ignore02(){
        System.out.println("ignore02执行");
    }
    @Test(enabled = true)
    public void ignore03(){
        System.out.println("ignore03执行");
    }
}
