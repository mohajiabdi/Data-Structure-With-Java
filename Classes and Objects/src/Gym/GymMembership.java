package Gym;

import java.util.Scanner;

public class GymMembership {
    String memberName,memberId;
    double monthlyFee;
    private static double discountRate =0.1;


    //contructors


    public GymMembership(String memberName, String memberId, double monthlyFee) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
    }

    double calculateAnnualFee() {
        return monthlyFee * 12;

    }

    double calculateAnnualFeeWithDiscount(){
        double annual = monthlyFee * 12;
        return annual - (annual * discountRate);
    }

    void displayInfo(){
        System.out.println("Member Name: " + memberName + "\nMember ID: " + memberId + "\nMonthly Fee: " + monthlyFee);
    }

    public static void setDiscountRate(double discountRate) {
        GymMembership.discountRate = discountRate;
    }
}
