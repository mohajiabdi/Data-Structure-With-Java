package Library;

public class Main {
    public static void main(String[] args) {
      /*
        LibrarySeatBooking seat1 = new LibrarySeatBooking("Ali","Quit Zone");
        LibrarySeatBooking seat2 = new LibrarySeatBooking("Asho","Group Study");
        LibrarySeatBooking seat3 = new LibrarySeatBooking("Adan","Quit Zone");
        LibrarySeatBooking seat4 = new LibrarySeatBooking("Anzal","Group Study");
        LibrarySeatBooking seat5 = new LibrarySeatBooking("MoHaji","Quit Zone");

        LibrarySeatBooking.displayTotalSeats();
        seat1.bookSeat(1);
       // System.out.println(seat1.seatNumber);
        seat2.bookSeat(2);
        seat3.bookSeat(3);
        seat4.bookSeat(1); // Wrogn lets use arrays

*/

        LibrarySeatBooking[] seats = new LibrarySeatBooking[5];

        seats[0] = new LibrarySeatBooking("Ali", "Quit Zone");
        seats[1] = new LibrarySeatBooking("Asho", "Group Study");
        seats[2] = new LibrarySeatBooking("Adan", "Quit Zone");
        seats[3] = new LibrarySeatBooking("Anzal", "Group Study");
        seats[4] = new LibrarySeatBooking("MoHaji", "Quit Zone");

        LibrarySeatBooking.displayTotalSeats();
        seats[0].bookSeat(1);
        seats[1].bookSeat(2);
        seats[2].bookSeat(3);
        seats[3].bookSeat(1); // This should not be allowed since seat 1 is already occupied

        // You can test various scenarios here
        for(int i = 0; i <seats.length; i++){
            seats[i].displaySeatStatus();
        }







    }
}
