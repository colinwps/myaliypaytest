package com.colinapp.myaliypaytest.service;

import com.alipay.api.AlipayApiException;
import com.colinapp.myaliypaytest.dao.Order;

public interface AliPayService {
    String aliPay(Order order) throws AlipayApiException;
}
