package Library;

public class LibrarySeatBooking {
    String customerName,section;
    int seatNumber;
    boolean isOccupied;
    static int totalSeats;


    //Constructors

    public LibrarySeatBooking(String customerName, String section) {
        this.customerName = customerName;
        this.section = section;
        this.isOccupied = false;
        this.seatNumber = 0;
        totalSeats++;
    }

    void bookSeat(int seatNumber) {
        if(seatNumber <= totalSeats && seatNumber >0){
            if(!isOccupied) {
                isOccupied = true;
                this.seatNumber = seatNumber;
              //  System.out.println("Seat booked successfully for ");
            } else {
                System.out.println("Seat " + seatNumber + " is already occupied.");
            }
        }else{
            System.out.println("\n\t\tInvalid seat number. \n\t\tPlease choose a seat between 1 and " + totalSeats);
        }
    }

    void vacateSeat(int seatNumber){
        if(seatNumber <= totalSeats && seatNumber >0){
            if(isOccupied) {
                isOccupied = false;
               // System.out.println("Seat vacated successfully for ");
            } else {
                System.out.println("Seat " + seatNumber + " is not occupied.");
            }
        }else{
            System.out.println("\n\t\tInvalid seat number. \n\t\tPlease choose a seat between 1 and " + totalSeats);
        }
    }

    static void displayTotalSeats(){
        System.out.println("Total Seats in the library: " + totalSeats);
    }

    void displaySeatStatus(){
        System.out.println("Seat " + seatNumber + " is occupied by " + customerName);
    }



}
