package br.com.crinnnger.codeanywhere.SpringAzure.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("group1")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_group1')")
    public String group1(){
        return "group1";
    }

    @GetMapping("group2")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_group2')")
    public String group2(){
        return "group2";
    }


}
