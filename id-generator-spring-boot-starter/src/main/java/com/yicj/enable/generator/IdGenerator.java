package com.yicj.enable.generator;

import java.util.Random;

public class IdGenerator {
    private Integer randomLength;
    private String prefix;
    public void setRandomLength(Integer randomLength) {
        this.randomLength = randomLength;
    }
    public void setPrefix(String prefix) {

        this.prefix = prefix;
    }
    public  String getPrefixTimeRandomId(){
        return prefix+System.currentTimeMillis()+new Random(randomLength).nextInt();
    }
    public  String getPrefixTimeId(){
        return prefix+System.currentTimeMillis();
    }
}