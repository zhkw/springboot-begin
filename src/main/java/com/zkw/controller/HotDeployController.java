package com.zkw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotDeployController {

    @RequestMapping("/say")
    public String say(ModelMap mod){
        mod.addAttribute("name","zkuuuw");
        return "imooc";
    }
}
