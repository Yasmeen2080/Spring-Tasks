/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springcore.dependencyinjection;

/**
 *
 * @author Yasmeen
 */
public class UndefinedCoach implements Coach {
private FortuneService fortuneService;



///////Define Constructor injection
    public UndefinedCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkOut() {
        return "unDefined";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
    
}
