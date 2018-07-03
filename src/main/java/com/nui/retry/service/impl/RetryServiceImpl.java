package com.nui.retry.service.impl;

import com.nui.retry.service.RetryHandleService;
import com.nui.retry.service.RetryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;


@Service
public class RetryServiceImpl implements RetryService {
    private static final Logger log = LoggerFactory.getLogger(RetryServiceImpl.class);

    @Autowired
    private RetryHandleService retryHandleService;

//    @Retryable(value = {Exception.class} ,maxAttempts = 3 , backoff =  @Backoff(delay = 1000))
    @Override
    public boolean callRetry(String name) {
//        log.debug("Start call Retry");
//        for (int i = 0; i < 10000; i++) {
//            if (i == 9999) {
//                i = i / 0;
//            }
//        }
//        log.debug("End call Retry");
//        return false;

        try{
            retryHandleService.test1(1);
            retryHandleService.test2(1,2);

        }catch (Exception ex){
            System.out.println(ex);
        }

        return false;
    }

    @Override
    public boolean recoverNullPointerException(NullPointerException n) {
        return false;
    }

    //    @Override
//    @Recover
    public boolean recoverArithmeticException(ArithmeticException a, String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("www");

        }
        return false;
    }
}
