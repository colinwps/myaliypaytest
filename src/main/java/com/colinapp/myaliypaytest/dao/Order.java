package com.colinapp.myaliypaytest.dao;

/**
 *
 *
 *实体类
 */
public class Order {

    /**
     * 客户订单号
     */
    private String out_trade_no;

    /**
     * 订单名称
     */
    private String subject;

    /**
     * 金额
     */
    private String total_amount;

    /**
     * 描述
     */
    private String description;

    /**
     * 超时
     */
    private  String timeout_express = "10m";

    /**
     * 产品编号
     */
    private String product_code = "kd_cp";


}
