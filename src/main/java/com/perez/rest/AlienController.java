package com.perez.rest;

import com.perez.rest.dao.AlienRepo;
import com.perez.rest.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid) {

        System.out.println("At /getAlien ... alien="+aid);
        Alien alien = repo.findById(aid).orElse(new Alien());
        ModelAndView mv = new ModelAndView("ShowAlien.jsp");
        mv.addObject("alien",alien);
        return(mv);
    }

    @RequestMapping("/getManyAlien")
    public ModelAndView getManyAlien(@RequestParam String tech) {

        System.out.println("At /getManyAlien ... alienTech="+tech);
        //Alien alien = repo.findById(aid).orElse(new Alien());
        List<Alien> aL = repo.findByTech(tech);
        for (Alien a : aL) {
            System.out.println("Tech ="+tech+"Alien="+a);
        }
        ModelAndView mv = new ModelAndView("ShowAlien.jsp");
        mv.addObject("alien",aL);
        return(mv);
    }

    @RequestMapping("/aliens")
    @ResponseBody
    public String getAliens() {

        System.out.println("At /aliens ... ");
        //Alien a = repo.findById(aid).orElse(new Alien());
        //Alien alien = repo.findById(aid).orElse(new Alien());
//        List<Alien> aL = repo.findByTech(tech);
//        for (Alien a : aL) {
//            System.out.println("Tech ="+tech+"Alien="+a);
//        }
//        ModelAndView mv = new ModelAndView("ShowAlien.jsp");
//        mv.addObject("alien",aL);
        return(repo.findAll().toString());
    }
}
