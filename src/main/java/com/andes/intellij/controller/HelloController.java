package com.andes.intellij.controller;

import com.andes.intellij.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class HelloController {
    private final TestService testService;

    @GetMapping("/0001")
    public ResponseEntity<String> getTest()
    {
        String res = testService.helloWorld();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
