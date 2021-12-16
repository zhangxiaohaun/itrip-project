package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author zxh
@date 2021/12/14 -- 14:44
*/
/**
    * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_trade_ends")
public class ItripTradeEnds {
    /**
     * 订单ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 订单编号(注意非支付宝交易编号tradeNo)
     */
    @TableField(value = "order_no")
    private String orderNo;

    /**
     * 标识字段(默认0：未处理；1：处理中)
     */
    @TableField(value = "flag")
    private Boolean flag;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;
}