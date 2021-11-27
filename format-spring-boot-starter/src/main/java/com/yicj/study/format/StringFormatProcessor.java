package com.yicj.study.format;

import java.util.Objects;

public class StringFormatProcessor implements FormatProcessor{
    @Override
    public String format(Object obj) {
        return "StringFormatProcessor : " + Objects.toString(obj);
    }
}
