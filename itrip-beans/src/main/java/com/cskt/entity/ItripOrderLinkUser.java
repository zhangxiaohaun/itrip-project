package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author zxh
@date 2021/12/14 -- 14:44
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_order_link_user")
public class ItripOrderLinkUser {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 联系人id
     */
    @TableField(value = "link_user_id")
    private Long linkUserId;

    /**
     * 入住人姓名逗号分隔
     */
    @TableField(value = "link_user_name")
    private String linkUserName;

    @TableField(value = "creation_date")
    private Date creationDate;

    @TableField(value = "created_by")
    private Long createdBy;

    @TableField(value = "modify_date")
    private Date modifyDate;

    @TableField(value = "modified_by")
    private Long modifiedBy;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;
}