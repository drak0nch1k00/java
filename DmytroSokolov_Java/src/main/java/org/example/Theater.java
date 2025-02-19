package org.example;

import java.util.HashMap;

class Theater {
    private HashMap<Integer, Customer> customers = new HashMap<>();
    private HashMap<Integer, Ticket> tickets = new HashMap<>();
    private HashMap<String, MovieScreening> screenings = new HashMap<>();

    public void addCustomer(int id, String name, int age) {
        customers.put(id, new Customer(id, name, age));
    }

    public void sellTicket(Ticket ticket) {
        tickets.put(ticket.getTicketId(), ticket);
    }

    public void addMovieScreening(String movieTitle, String screeningTime) {
        screenings.put(movieTitle, new MovieScreening(movieTitle, screeningTime));
    }

    public void enrollCustomerInScreening(int customerId, String movieTitle) {
        if (!customers.containsKey(customerId)) {
            System.out.println("Customer ID not found.");
            return;
        }

        if (!screenings.containsKey(movieTitle)) {
            System.out.println("Movie screening not found.");
            return;
        }

        MovieScreening screening = screenings.get(movieTitle);
        Customer customer = customers.get(customerId);
        screening.addAttendee(customer);
    }

    public void printCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    public void printTickets() {
        System.out.println("Tickets:");
        for (Ticket ticket : tickets.values()) {
            System.out.println(ticket);
        }
    }

    public void printScreenings() {
        System.out.println("Movie Screenings:");
        for (MovieScreening screening : screenings.values()) {
            System.out.println(screening);
        }
    }
}
