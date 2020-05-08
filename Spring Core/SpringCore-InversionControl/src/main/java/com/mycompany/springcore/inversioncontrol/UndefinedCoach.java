/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springcore.inversioncontrol;

/**
 *
 * @author Yasmeen
 */
public class UndefinedCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "unDefined";
    }
    
}
