package Gym;

public class Main {
    public static void main(String[] args) {
        GymMembership member1 = new GymMembership("Ali","G110",20);
        GymMembership member2 = new GymMembership("MoHaji","G112",30);

        System.out.println("Member 1 Annual Fee: " + member1.calculateAnnualFee());
        System.out.println("Member 1 Annual Fee With Discount: " + member1.calculateAnnualFeeWithDiscount());
        GymMembership.setDiscountRate(0.2); // Set discount rate
        System.out.println("Member 2 Annual Fee: " + member2.calculateAnnualFee());
        System.out.println("Member 2 Annual Fee With Discount: " + member2.calculateAnnualFeeWithDiscount());

        System.out.println("----------------------\n");
        member1.displayInfo();
        System.out.println("-----------------\n");
        member2.displayInfo();

    }
}
