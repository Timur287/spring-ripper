package com.example.springripper.quoters;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TerminatorQuoter implements Quoter{

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public TerminatorQuoter(int i){
        System.out.println("1 phase");
        System.out.println(repeat);
    }

    public TerminatorQuoter(){
        System.out.println("Default constructor");
    }

//    public void init(){
//        System.out.println("Phase 2");
//        System.out.println(repeat);
//    }

    @PostConstruct
    public void init() throws Exception
    {
        System.out.println("Я инит-метод " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println("Я дестрой-метод " + this.getClass().getSimpleName());
    }

    private String message;

    public void setMessage(String message){
        this.message=message;
    }


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
