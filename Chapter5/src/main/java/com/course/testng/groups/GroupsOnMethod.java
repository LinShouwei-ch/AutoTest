package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test01(){
        System.out.println("这是服务端的test01");
    }
    @Test(groups = "server")
    public void test02(){
        System.out.println("这是服务端的test02");
    }
    @Test(groups = "client")
    public void test03(){
        System.out.println("这是客户端的test03");
    }
    @Test(groups = "client")
    public void test04(){
        System.out.println("这是客户端的test04");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("BeforeGroups这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("AfterGroups这是服务端组运行之后运行的方法");
    }
}
