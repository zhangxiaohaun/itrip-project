package com.cskt.itripauth.common.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zxh
 * @date 2021/12/16 -- 14:22
 */
@Data
@ApiModel(value = "自定义service层异常")
public class ServiceException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;

    public ServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
