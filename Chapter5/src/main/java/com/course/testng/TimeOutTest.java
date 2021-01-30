package com.course.testng;

import com.course.testng.thread.ThreadOnXml;
import org.testng.annotations.Test;

public class TimeOutTest {
    //期望3秒搞定，实际2秒搞定
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    //期望2秒搞定，实际3秒搞定
    @Test(timeOut = 2000)
    public void testFail() throws InterruptedException {
        Thread.sleep(3000);
    }
}
