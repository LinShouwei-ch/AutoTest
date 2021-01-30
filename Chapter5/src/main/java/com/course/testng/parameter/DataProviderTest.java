package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    //例子1
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name:"+name+",age:"+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] objects = new Object[][]{
                {"Tom",10},
                {"Jone",20}
        };
        return objects;
    }


    //例子2
    @Test(dataProvider = "method")
    public void test01(String name,int age){
        System.out.println("test01-"+"name:"+name+",age:"+age);
        System.out.println();
    }
    @Test(dataProvider = "method")
    public void test02(String name,int age){
        System.out.println("test02-"+"name:"+name+",age:"+age);
    }
    @DataProvider(name = "method")
    public Object[][] methodDataTest(Method method){
        Object[][] objects = null;
        if (method.getName().equals("test01")){
            objects = new Object[][]{
                    {"Tom",10}
            };
        } else {
            objects = new Object[][]{
                    {"Jone",20}
            };
        }
        return objects;
    }
}
