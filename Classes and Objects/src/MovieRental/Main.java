package MovieRental;



public class Main {
    public static void main(String[] args) {
       MovieRental movieRental1 = new MovieRental("J110","Ali Abdi Hassan","X-Men 2015",
                                10,1);
MovieRental movieRental2 = new MovieRental("J112","MoHaji","Iron Man 2013",
                                30,1);
//
//       movieRental1.extendrental(5);
//        movieRental1.displayinfo();
//       //movieRental1.applyLateFee(11,1.5);
//        movieRental1.returnMovie();
//        movieRental1.displayinfo();
//        movieRental2.displayinfo();
//        movieRental2.extendrental(3);
//        movieRental2.displayinfo();
        movieRental1.extendrental(4);
        System.out.println(movieRental1.totalCost);
    }
}
