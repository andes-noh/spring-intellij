package com.andes.intellij.service.impl;

import com.andes.intellij.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String helloWorld() {
        return "hello world";
    }
}
