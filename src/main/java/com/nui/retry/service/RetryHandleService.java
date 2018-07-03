package com.nui.retry.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public interface RetryHandleService {
    void test1(int x);

    void test2(int x , int y);

//    @Recover
//    void test1Recover(Exception ex,int x);
//
//    @Recover
//    void test2Recover(Exception ex ,int x,int y);
}

