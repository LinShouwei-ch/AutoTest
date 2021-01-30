package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test01(){
        System.out.println("test01");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = "test01")
    public void test02(){
        System.out.println("test02");
    }
}
