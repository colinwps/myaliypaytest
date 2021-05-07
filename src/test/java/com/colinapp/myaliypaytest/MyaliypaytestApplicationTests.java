package com.colinapp.myaliypaytest;

import com.colinapp.myaliypaytest.config.AliPayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyaliypaytestApplicationTests {

    @Autowired
    AliPayConfig a;

    @Test
    void contextLoads() {

        System.out.println(a.getSignType());
    }

}
