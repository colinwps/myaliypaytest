package com.colinapp.myaliypaytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlipayInfo {


    @GetMapping("buy")
    public  String BayPage(){
        return "BayInfo";
    }

}
