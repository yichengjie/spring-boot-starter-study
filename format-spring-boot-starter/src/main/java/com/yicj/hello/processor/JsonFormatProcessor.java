package com.yicj.hello.processor;

import com.alibaba.fastjson.JSON;

public class JsonFormatProcessor implements FormatProcessor{

    @Override
    public String format(Object obj) {
        return "JsonFormatProcessor : " + JSON.toJSONString(obj);
    }
}
