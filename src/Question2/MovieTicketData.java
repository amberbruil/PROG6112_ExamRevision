/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 * OBJECT CLASS FOR MOVIE TICKETS
 * @author amber-mac
 */
public class MovieTicketData {
    private final String movieName;
    private final int numberOfTickets;
    private final double ticketPrice;

    // Master constructor
    public MovieTicketData(String movieName, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }

    // Getters
    public String getMovieName() { return movieName; }
    public int getNumberOfTickets() { return numberOfTickets; }
    public double getTicketPrice() { return ticketPrice; }
}
