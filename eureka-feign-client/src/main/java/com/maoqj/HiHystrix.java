package com.maoqj;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
