package com.perez.rest;

import com.perez.rest.dao.AlienRepo;
import com.perez.rest.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        System.out.println("At /");
        return("home.jsp");
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien a) {
        System.out.println("At /addAlien ... alien="+a.toString());
        repo.save(a);
        return("home.jsp");
    }
}
