package com.nui.retry.controller;

import com.nui.retry.service.RetryHandleService;
import com.nui.retry.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetryController {

    @Autowired
    private RetryService retryService;

    @Autowired
    private RetryHandleService retryHandleService;

    @GetMapping("/retry")
    public void retry(){
        retryService.callRetry("test");
    }
}
