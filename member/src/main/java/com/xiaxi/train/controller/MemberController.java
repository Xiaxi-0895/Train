package com.xiaxi.train.controller;

import com.xiaxi.common.response.ApiRestResponse;
import com.xiaxi.train.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public ApiRestResponse welcome() {
        Map<String, Object> map = new HashMap<>();
        map.put("idNumber", "123456789012345678");
        map.put("result","欢迎访问会员服务");
        map.put("mobile", memberService.getMemberMobileById(1L));

        return ApiRestResponse.success(map);
    }

}
