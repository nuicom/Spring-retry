package com.nui.retry.service.impl;

import com.nui.retry.service.RetryHandleService;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryHandleServiceImpl implements RetryHandleService {
    int count =0;
    @Override
    @Retryable(value = {Exception.class} ,maxAttempts = 3 , backoff =  @Backoff(delay = 1000))
    public void test1(int x) {

    }

    @Override
    @Retryable(value = {ArithmeticException.class} ,maxAttempts = 3 , backoff =  @Backoff(delay = 1000))
    public void test2(int x , int y) {
        if(count==2){

        }else{
            count++;
            int i = 1/0;
        }
    }


//    @Override
//    public void test1Recover(Exception ex, int x) {
//
//    }
//
//    @Override
//    public void test2Recover(Exception ex, int x, int y) {
//
//    }
}
