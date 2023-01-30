package com.ssk.springboottest2.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        log.info("Test1:{}","info");
        log.debug("Test1:{}","debug");
        log.warn("Test1:{}","warn");
        log.error("Test1:{}","error");
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest request) {
        String token = request.getHeader("token");
        log.info("token:{}",token);
        return "test2";
    }

    @GetMapping("/test3")
    public JSONObject test3(String name, String pwd) {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("pwd",pwd);
        return json;
    }

    @PostMapping("/test4")
    public String test4(String name, String pwd) {
        return "test4";
    }

    @GetMapping("/test5")
    public String test5() {
        return "test5 jenkins测试";
    }
}
