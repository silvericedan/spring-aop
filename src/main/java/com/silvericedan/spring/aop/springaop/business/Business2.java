package com.silvericedan.spring.aop.springaop.business;

import com.silvericedan.spring.aop.springaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        //some Business Logic here and then
        return dao2.retrieveSomething();
    }
}
