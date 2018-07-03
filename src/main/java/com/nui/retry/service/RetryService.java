package com.nui.retry.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public interface RetryService {
//    @Retryable(value = {Exception.class} ,maxAttempts = 3 , backoff =  @Backoff(delay = 1000))
    boolean callRetry(String name);

//    @Recover
    boolean recoverNullPointerException(NullPointerException n);

//    @Recover
//    boolean recoverArithmeticException(ArithmeticException a,String name);
}
