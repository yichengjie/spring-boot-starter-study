package com.yicj.format.processor;

import java.util.Objects;

public class StringFormatProcessor implements FormatProcessor{
    @Override
    public String format(Object obj) {
        return "StringFormatProcessor : " + Objects.toString(obj);
    }
}
