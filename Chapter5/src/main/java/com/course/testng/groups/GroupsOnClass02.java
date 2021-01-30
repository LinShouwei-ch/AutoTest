package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass02 {
    public void student01(){
        System.out.println("GroupsOnClass02中的student01运行");
    }
    public void student02(){
        System.out.println("GroupsOnClass02中的student02运行");
    }
}
