package com.yicj.study;

import com.yicj.study.format.FormatProcessor;

public class HelloFormatTemplate {

    private FormatProcessor formatProcessor ;

    public HelloFormatTemplate(FormatProcessor processor){
        this.formatProcessor = processor ;
    }

    public String doFormat(Object obj){
        StringBuilder builder = new StringBuilder() ;
        builder.append("Execute format").append("\n") ;
        builder.append("Obj format result : ") ;
        builder.append(formatProcessor.format(obj)).append("\n") ;
        return builder.toString();
    }
}
