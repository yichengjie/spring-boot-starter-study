package com.yicj.dynamic.bean;

import lombok.Data;

@Data
public class PigPet {

    private String prefix ;

    private String name;

    private Integer age;

    public PigPet() {
        System.out.println("初始化了PigPet()");
    }

    public String hello(){

        return this.toString() ;
    }
}