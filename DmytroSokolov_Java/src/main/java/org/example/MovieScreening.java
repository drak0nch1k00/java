package org.example;

import java.util.ArrayList;
import java.util.List;

class MovieScreening {
    private String movieTitle;
    private String screeningTime;
    private List<Customer> attendees;

    public MovieScreening(String movieTitle, String screeningTime) {
        this.movieTitle = movieTitle;
        this.screeningTime = screeningTime;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(Customer customer) {
        attendees.add(customer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(movieTitle).append(" (").append(screeningTime).append("): ");
        for (int i = 0; i < attendees.size(); i++) {
            sb.append(attendees.get(i).getName());
            if (i < attendees.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString(); // Возвращаем строку
    }

}
