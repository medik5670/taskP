package com.company;

public class BmiService {
    public static double weight;
    public static double height;
    public double calculate;
    static double index;
    public static int calculate() {
        index = weight / (height * height);
        return (int) index;
    }
}
