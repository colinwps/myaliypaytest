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

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

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
