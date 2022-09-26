package com.example.springripper.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       Quoter terminatorQuoter = context.getBean(Quoter.class);
       Quoter terminatorQuoter1 = context.getBean(Quoter.class);
       terminatorQuoter.sayQuote();
        System.out.println(terminatorQuoter);
        System.out.println(terminatorQuoter1);
        context.close();

    }
}
