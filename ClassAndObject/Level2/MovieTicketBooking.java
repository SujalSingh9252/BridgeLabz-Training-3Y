class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.booked = false;
    }

    void bookTicket() {
        if (!booked) {
            booked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber + " for Rs." + price);
        } else {
            System.out.println("Seat already booked!");
        }
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (booked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 12, 250);
        ticket.bookTicket();
        ticket.displayDetails();
    }
}