package com.yicj.content.service.impl;


import com.yicj.content.service.ContentService;

public class SimpleContentService implements ContentService {
    @Override
    public String doSomething() {
        return "do some simple things" ;
    }
}