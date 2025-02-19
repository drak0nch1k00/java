package org.example;

abstract class Ticket {
    private int ticketId;
    private int customerId;

    public Ticket(int ticketId, int customerId) {
        this.ticketId = ticketId;
        this.customerId = customerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public abstract double getPrice();
}
