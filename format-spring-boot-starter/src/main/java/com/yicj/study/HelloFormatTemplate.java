package com.yicj.study;

import com.yicj.study.config.HelloProperties;
import com.yicj.study.format.FormatProcessor;

public class HelloFormatTemplate {

    private FormatProcessor formatProcessor ;
    private HelloProperties helloProperties ;

    public HelloFormatTemplate(FormatProcessor processor, HelloProperties helloProperties){
        this.formatProcessor = processor ;
        this.helloProperties = helloProperties ;
    }

    public String doFormat(Object obj){
        StringBuilder builder = new StringBuilder() ;
        builder.append("Execute format").append("\n") ;
        builder.append("HelloProperties: ") ;
        builder.append(helloProperties.getInfo()).append("\n") ;
        builder.append("Obj format result : ") ;
        builder.append(formatProcessor.format(obj)).append("\n") ;
        return builder.toString();
    }
}
