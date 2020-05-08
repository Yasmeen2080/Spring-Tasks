/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springcore.inversioncontrol;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Yasmeen
 */
public class Main2 {
   static  Coach coach;
    public static void main(String [] args)
    {
        ClassPathXmlApplicationContext applicationContext= new  ClassPathXmlApplicationContext("myConfig.xml");
          try{
        System.out.println("Enter 1 For Trach coach and 2 for Baseballcoach");
        Scanner sc = new Scanner(System.in);
        int next = sc.nextInt();

          switch (next) {
            case 1:
                coach = applicationContext.getBean("trackCoach",Coach.class);
                break;
            case 2:
                  coach = applicationContext.getBean("baseBallCoach",Coach.class);
                break;
              default:
                 coach = applicationContext.getBean("undefiendCoach",Coach.class);
                break;
        
        }
    }
        catch(InputMismatchException inputMismatchException)
        {
                        coach = applicationContext.getBean("undefiendCoach",Coach.class);
        }
        finally
        {
             System.out.println("Coach is  " + coach.getDailyWorkOut());
             applicationContext.close();
        }
    }

        
        
        
        
        
    }
    

