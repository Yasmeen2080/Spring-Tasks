/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springcore.inversioncontrol;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Yasmeen
 */
public class Main {
static Coach coach;
    public static void main(String args[]) {
        //////////This is Hard Coded Way!! Soooo We need to define Configration file .xml
        try{
        System.out.println("Enter 1 For Trach coach and 2 for Baseballcoach");
        Scanner sc = new Scanner(System.in);
        int next = sc.nextInt();

          switch (next) {
            case 1:
                coach = new TrackCoach();
                break;
            case 2:
                coach = new BaseballCoach();
                break;
              default:
                coach= new UndefinedCoach();
                break;
        
        }
    }
        catch(InputMismatchException inputMismatchException)
        {
                     coach= new UndefinedCoach();
        }
        finally
        {
             System.out.println("Coach is = " + coach.getDailyWorkOut());
        }
    }

}
