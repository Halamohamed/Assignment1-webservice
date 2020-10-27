package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,3,2,2,3,2,1,4));

        Solutions solutions = new Solutions();

        //FizzBuzz
        System.out.println("1. FizzBuzz : \n" + solutions.fizzBuzz());

        //Dubbletter
        System.out.println("2. Dubbletter:");
        solutions.duplicates(integers);

        //Rövarspråket
        //List<String> s = solutions.robberLang();

        System.out.println("3. Rövarspråket :");
        System.out.println(solutions.robberLang("Hej på dig"));

        //Rövarspråket2
        System.out.println("4. Rövarspråket 2: ");
        System.out.println(solutions.robberLangBack("Hohejoj popå dodigog"));

        //Riskorn
        System.out.println("5. Riskorn : ");
        System.out.println(" 5 riskorn på ruta : " +solutions.riceGrain(5));
        System.out.println(" 8 riskorn på ruta : " +solutions.riceGrain(8));
        System.out.println(" 1000000 riskorn på ruta : " +solutions.riceGrain(1000000));

    }



}
