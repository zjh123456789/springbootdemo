package com.zjh.model;

import lombok.Data;

/**
 * 订单商品
 *
 * @author  jinghui.zhu
 * @date    2020/5/30 11:10:46
 */
@Data
public class OrderCommodity {

    /**
     * 主键ID
     */
    private Long id;
    /**
     * 订单商品明细ID
     */
    private Long orderDetailId;
    /**
     * 订单ID（源自订单信息的ID字段）
     */
    private Long orderId;
    /**
     * 商品ID
     */
    private Long commodityId;
    /**
     * 商品编号
     */
    private String commodityCode;
    /**
     * 商品名称
     */
    private String commodityName;

}
