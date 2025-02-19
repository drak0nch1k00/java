package org.example;

class VIPTicket extends Ticket {
    private String movieTitle;
    private String seatNumber;
    private String extraBenefits;

    public VIPTicket(int ticketId, int customerId, String movieTitle, String seatNumber, String extraBenefits) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.extraBenefits = extraBenefits;
    }

    @Override
    public double getPrice() {
        return 20.0;
    }

    @Override
    public String toString() {
        return "VIPTicket: " + movieTitle + ", Seat: " + seatNumber + ", Price: $" + getPrice() + ", Benefits: " + extraBenefits;
    }
}
