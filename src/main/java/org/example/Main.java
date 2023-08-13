package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение m: ");
        double m;
        m = sc.nextDouble();

        System.out.print("Введите значение n: ");
        double n;
        n = sc.nextDouble();

        double distanceTo10M = calculateDistance(m);
        double distanceTo10N = calculateDistance(n);

        double closestValue;
        if(distanceTo10M < distanceTo10N){
            closestValue = m;
        } else {
            closestValue = n;
        }
        System.out.println("Число " + closestValue + " ближе к 10.");


    }

    private static double calculateDistance(double value) {
        return Math.abs(value - 10);
    }
}