package com.yupi.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;


/**
 * @author sudashui
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;


    /**
     * 请求参数
     */
    private String userRequestParams;


}
