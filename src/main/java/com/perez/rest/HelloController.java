package com.perez.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest req) {
        System.out.println("name="+req.getParameter("name"));
        //return "name="+req.getParameter("name");
        HttpSession s = req.getSession();
        s.setAttribute("name",req.getParameter("name"));
        return "home";
    }

}
