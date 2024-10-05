package MovieRental;

public class MovieRental {
    // DataFields
    String rentalId, customerName, movieTitle;
    int daysRented;
    double costPerDay, totalCost;

    // Constructor

    public MovieRental(String rentalId, String customerName,String movieTitle, int daysRented,double costPerDay){
        this.rentalId = rentalId;
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.daysRented = daysRented;
        this.costPerDay = costPerDay;
        this.totalCost = daysRented * costPerDay;
    }

    //Methods

    public void extendrental(int extraDays){
        this.daysRented += extraDays;
        this.totalCost = this.daysRented * costPerDay;
        System.out.println("\n\t\tDays Extended: "+ extraDays+ "\n");
    }

    public void returnMovie(){
       if(this.daysRented == 0){
           System.out.println("Movie Has Already been returned!..");
       }else{
           this.daysRented =0;
           this.totalCost = this.costPerDay * this.daysRented;
           System.out.println("\n\t\tMovie Return Confirmed!..\n");
       }
    }

    public void applyLateFee(int daysLate,double lateFeePerDay){

        double lateFee = daysLate * lateFeePerDay;
        this.totalCost += lateFee;
        System.out.println("\t\tLate fee applied is: "+ lateFee +" Dolllars\n\n");
    }

    public void displayinfo(){
        System.out.println("\n\nRental Id: " + this.rentalId +
                            "\nCustomer Name:"+ this.customerName +
                            "\nMovie Title:"+ this.movieTitle +
                            "\nDays Rented:"+ this.daysRented +" Days"+
                            "\nCost Per day:"+ this.costPerDay + " Dollars"+
                            "\nTotal Cost:"+ this.totalCost +" Dollars");
    }
}
