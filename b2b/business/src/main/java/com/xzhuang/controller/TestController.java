package com.xzhuang.controller;

import com.xzhuang.model.Supplier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/index")
    public String getIndex() {
        return "1";
    }
}
