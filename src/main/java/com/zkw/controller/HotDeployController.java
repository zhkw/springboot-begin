package com.zkw.controller;

import com.zkw.dao.StudentRepository;
import com.zkw.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HotDeployController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/say")
    public String say(ModelMap mod){
        List<Student> list = studentRepository.findAll();
        mod.addAttribute("name","zhoukw");
        mod.addAttribute("todos",list);
        return "imooc";
    }
}
