package com.student.web;

import com.student.common.response.Result;
import com.student.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: wuchao
 * @date： 2017/5/2
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {


    @Resource
    private UserService userService;


    @ResponseBody
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public Result checkUser(@RequestParam String name, @RequestParam String password) {
        Result result = new Result();
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            return new Result("参数错误", "ERROR", null);
        }

        boolean flag = userService.checkUsers(name,password);

        if (!flag) {
            result.setCode("SUCCESS");
            result.setMsg("有该用户信息");
        }

        return result;

    }

}
