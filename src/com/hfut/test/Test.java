package com.hfut.test;

import com.hfut.pojo.People;
import com.hfut.pojo.PeopleFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

        People people=ac.getBean("peo", People.class);
        System.out.println(people);


        People peo1=ac.getBean("peo1", People.class);
        System.out.println(peo1);

        People staticpeo=ac.getBean("staticpeo", People.class);
        System.out.println(staticpeo);
    }
}
