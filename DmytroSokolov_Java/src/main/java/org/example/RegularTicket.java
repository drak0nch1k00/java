package org.example;

class RegularTicket extends Ticket {
    private String movieTitle;
    private String seatNumber;

    public RegularTicket(int ticketId, int customerId, String movieTitle, String seatNumber) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
    }

    @Override
    public double getPrice() {
        return 12.0;
    }

    @Override
    public String toString() {
        return "RegularTicket: " + movieTitle + ", Seat: " + seatNumber + ", Price: $" + getPrice();
    }
}
