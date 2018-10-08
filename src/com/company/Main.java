package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap vao so thu nhat:");
        a = scanner.nextInt();
        System.out.println("Nhap vao so thu hai:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while(a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.print("UCLN:"+a);
    }
}
