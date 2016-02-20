package com.baidu.adxgate.portal.creative.controller;


import com.baidu.adxgate.portal.creative.bo.CreativeAuditInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author huangjinkun.
 * @date 16/1/4
 * @time 下午7:01
 */
@Controller
@RequestMapping(value = "/creative")
public class CreativeController {

    private static final Logger LOG = LoggerFactory.getLogger(CreativeController.class);


    @RequestMapping(value = "/audit_state" )
    @ResponseBody
    public CreativeAuditInfo getCreativeAuditInfo(){
        CreativeAuditInfo result = new CreativeAuditInfo();
        result.setId(1);
        result.setModTime(new Date().toString());
        result.setRejectReason("样式不符合规范");
        return result;
    }
}
