package com.in28minutes.learnspring.framework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspring.framework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
    
    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}
