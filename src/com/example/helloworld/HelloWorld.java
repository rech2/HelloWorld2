package com.example.helloworld;

/**
 * Created by Steven on 9/19/2016.
 */
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
      /*  System.out.println("Hello, World!");
        System.out.println("It's me,Howdy!");
       int x = 1000;
        if(x > 100){
            System.out.println("Way too much");
        }else if(x < 100){
            System.out.println("How did that happen");
        }else if(x == 100){
            System.out.println("Nailed It");
        }
        int y = 100;
        while(y >0){
            y--;
            System.out.print(y);
        }
       int v = 0;
        while (v <100){
            v++;
            if(v%5 == 0 && v%3 ==0){
                System.out.println("FizzBuzz");
            }else if(v%3 ==0){
                System.out.println("Fizz");
            }else if(v%5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.print(v);
            }
        }
        for(int i =1;i >100;i++){
            if(i%5 == 0 && i%3 ==0){
                System.out.println("FizzBuzz");
            }else if(i%3 ==0){
                System.out.println("Fizz");
            }else if(i%5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.print(v);
            }
        }
        for (int i = 2; i < 10; i = i*i) {
            System.out.println(i);
        }
String[]names={"Aryeh","Malka","Shaindel","Yaakov","Shaya"};
        System.out.print(names.length);
        System.out.print(names[4]);
        int[] num={2,4,6,8,10};
        int sum = 0;
        for(int i=0;i< num.length;i++){
            sum += num[i];
            System.out.println(sum);
            int [ ] myArr = {6, 42, 3, 7};
            int sums=0;
            for(int p=0; p<myArr.length; p++) {
                sums += myArr[p];
            }
            System.out.println(sums);
        }
        int[ ] primes = {2, 3, 5, 7};

        for (int t: primes) {
            System.out.println(t);
        }
int[][] multi={{1,2,3,4},{5,6,7,8,9}};
        int d=multi[1][3];
        System.out.print(d);*/
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);

    }
}
