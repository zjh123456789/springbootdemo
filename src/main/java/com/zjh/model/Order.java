package com.zjh.model;

import lombok.Data;

/**
 * 订单 model
 *
 * @author  jinghui.zhu
 * @date    2020/5/30 11:06:23
 */
@Data
public class Order {

    /**
     * 主健
     */
    private Long id;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 门店ID
     */
    private Long depId;

}
