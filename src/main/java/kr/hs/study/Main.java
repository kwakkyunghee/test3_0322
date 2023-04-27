package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Test obj1 = ctx.getBean("t", Test.class);
        obj1.prData();

        ctx.close();
    }
}