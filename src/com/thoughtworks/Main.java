package com.thoughtworks;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-(i-1);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
                for(int k1=1;k1<k;k1+=k){

                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}