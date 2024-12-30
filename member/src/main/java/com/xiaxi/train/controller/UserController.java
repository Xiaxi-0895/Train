package com.xiaxi.train.controller;

import com.xiaxi.common.response.ApiRestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/")
    public ApiRestResponse welcome() {
        Map<String, Object> map = new HashMap<>();
        map.put("idNumber", "123456789012345678");
        map.put("result","欢迎访问会员服务");

        return ApiRestResponse.success(map);
    }

}
