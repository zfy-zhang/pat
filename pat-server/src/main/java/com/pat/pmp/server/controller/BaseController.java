package com.pat.pmp.server.controller;

import com.pat.pm.common.respons.BaseResponse;
import com.pat.pm.common.respons.StatusCode;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description：基类
 * @Author 不才人
 * @Create Date 2020/2/18 11:21 上午
 * @Modify
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse info(String name) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        if (StringUtils.isBlank(name)) {
            name = "pat 权限管理平台";
        }
        response.setData(name);
        return response;
    }

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String page(String name, ModelMap modelMap){
        if (StringUtils.isBlank(name)){
            name="pat 权限管理平台!";
        }
        modelMap.put("name",name);
        modelMap.put("app","权限管理系统");

        return "pageOne";
    }
}
