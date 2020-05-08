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
public class CricketCoach implements Coach{
FortuneService fortuneService;
String emailaddress;

    public void setEmailaddress(String emailaddress) {
        System.out.println("Yes I am Your Address !! :)");
        this.emailaddress = emailaddress;
    }
 public CricketCoach() {
     System.out.println("Inside No Argument Constructor in Cricket!");
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    @Override
    public String getDailyWorkOut() {
        return "Cricket Coach";
    }

   
    @Override
    public String getFortune() {
       return  fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
             System.out.println("Inside Setter in Cricket!");
        this.fortuneService = fortuneService;
    }

   
    
}
