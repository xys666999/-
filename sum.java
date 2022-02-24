package com.itheima.sum;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a,sum=0;
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=8;i++){
            a= input.nextInt();
            sum+=a;
        }
        System.out.println("sum="+sum);
    }
}
