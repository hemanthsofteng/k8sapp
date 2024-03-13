package com.k8s.k8sapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/data")
    String getData()
    {
        return "This is messgae from POD";
    }
}
