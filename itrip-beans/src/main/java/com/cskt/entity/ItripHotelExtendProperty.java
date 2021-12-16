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
@TableName(value = "itrip_hotel_extend_property")
public class ItripHotelExtendProperty {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 酒店id
     */
    @TableField(value = "hotel_id")
    private Long hotelId;

    /**
     * 推广属性
     */
    @TableField(value = "extend_property_id")
    private Long extendPropertyId;

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