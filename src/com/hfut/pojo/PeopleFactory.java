package com.hfut.pojo;

public class PeopleFactory {
    public People newInstance(){
        return new People(1,"李四");
    }

    public static People newstaticInstance(){
        return new People(1,"静态工厂");
    }
}
