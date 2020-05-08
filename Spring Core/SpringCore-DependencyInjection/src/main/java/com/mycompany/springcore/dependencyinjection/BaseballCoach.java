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
public class BaseballCoach implements Coach
{
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "BaseBall Coach";

    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
    
    
}
