package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// IS ANY LONGER THAN THE SUM OF THE TWO OTHERS

    double l1,l2,l3;

    try {
        Scanner in = new Scanner(System.in);
        System.out.print("tast første længde ");
        l1 = in.nextDouble();
        System.out.print("tast anden længde ");
        l2 = in.nextDouble();
        System.out.print("tast tredje længde ");
        l3 = in.nextDouble();
    }
    catch (Exception e){
        System.out.println("Input have to be a number");
        return;
    }

    if(l1>l2+l3 || l2>l3+l1 || l3>l1+l2)  {
        System.out.println("You can not make a triangle from these input");
    }else    if(l1<l2+l3 || l2<l3+l1 || l3<l1+l2)  {
        System.out.println("You CAN make a triangle from these input");
    }

    }
}
