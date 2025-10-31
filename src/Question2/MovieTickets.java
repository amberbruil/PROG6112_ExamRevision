/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author amber-mac
 */
public class MovieTickets implements IMovieTickets {
    
    private static final double VAT_RATE = 1.15;
       
    // Calculate total price including VAT
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subTotal = numberOfTickets * ticketPrice;
        return subTotal * VAT_RATE;
    }

    /**
     * Movie name: not empty/blank
     * Ticket price: > 0
     * Number of tickets: > 0
     */
    @Override
    public boolean ValidateData(MovieTicketData data) {
        if (data == null) 
            return false;

        String name = data.getMovieName();
        if (name == null || name.trim().isEmpty()) 
            return false;

        if (data.getTicketPrice() <= 0) 
            return false;

        if (data.getNumberOfTickets() <= 0) 
            return false;

        return true;
    }
    
    
}
