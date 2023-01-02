package com.springBoot_annotation.controller;

import com.springBoot_annotation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class MyController {

    @Autowired
    @Qualifier("student1")
    private Student student;
    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    @ResponseBody
    public Student home(@RequestBody Student st) {
        st.studying();
        System.out.println("this is home method");
        this.student.setName("my name is Sanjay");
        return this.student;
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public String user(@PathVariable("userId") Integer userId)
    {
        return String.valueOf(userId);
    }
}
