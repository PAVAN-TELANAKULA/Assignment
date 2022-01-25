package com.uks.core.day2;
import java.util.Scanner;

public class ArrayPopulation {
    public void populateArray(){
        int a[] = new int[5];
        int b[] = new int[5];
        int a1 = a.length;
        int b1 = b.length;
        int c1=a1+b1;
        int c[]=new int[c1];

        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element for first array : ");
        for (i= 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter element for 2nd array : ");
        for (i = 0; i < 5; i++){
            b[i] = sc.nextInt();
        }
        for(i=0,j=0;i<5;i++,j+=2){
            c[j]=a[i];
        }
        for(i=0,j=1;i<5;i++,j+=2){
            c[j]=b[i];
        }
        for(i=0;i<c1;i++){
            System.out.print(c[i]+" ");
        }
    }


    public void print(){

        populateArray();
    }
}
