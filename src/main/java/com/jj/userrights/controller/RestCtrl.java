package com.jj.userrights.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {
    @GetMapping("/alive")
    public String show() {
     /*   requestService.setValue();
        System.out.println("Admin controller"+requestService.getValue());*/
        return "Alive";
    }
}
