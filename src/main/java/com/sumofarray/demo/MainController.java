package com.sumofarray.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String sumofarray () {


            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int sum = 0;
            double average;
            for (int i = 0; i < arr.length; i++)
            {
                  sum  += arr[i];

            }
            average = ((double)sum / (double)arr.length);

            return "<b>"+"Sum:" + "</b>" + sum + " " + "<br>" +"<b>" +"Average:" + " " +"</b>" + average ;



        }

    }




