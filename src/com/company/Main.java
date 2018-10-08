package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("reqemi daxil edin");
//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        if(musbetdirmi(a)){
//        System.out.println("Musbetdir");}
//        else{
//            System.out.println("menfidir");
//        }
	// write your code here

//        System.out.println("reqemi daxil edin");
//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        System.out.println(faktorial(a));
//
//        int birteref=3;
//        int ikinciteref=4;
//        System.out.println(hipetonuz(birteref,ikinciteref));
//

        int a=15;
        int b=4;
        System.out.println(mod(a,b));



    }
    static boolean musbetdirmi (int reqem){
        return reqem>0;}
        static int faktorial(int reqem){
        int fkt=1;
        for (int i=1; i<=reqem; i++){
            fkt=fkt*i;
        }
        return fkt;
        }
        static float hipetonuz(int a,int b){
        return (float) Math.sqrt(a*a+b*b);
        }
        static int mod(int a,int b){
        return a%b;
        }



}
