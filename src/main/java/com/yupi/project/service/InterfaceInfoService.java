package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yuapicommon.model.entity.InterfaceInfo;

/**
* @author sudashui
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-09-05 21:01:06
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
