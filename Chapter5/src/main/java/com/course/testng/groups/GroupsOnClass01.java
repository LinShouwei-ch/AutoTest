package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass01 {
    public void student01(){
        System.out.println("GroupsOnClass01中的student01运行");
    }
    public void student02(){
        System.out.println("GroupsOnClass01中的student02运行");
    }
}
