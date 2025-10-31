/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author amber-mac
 */
public class MovieTickets implements IMovieTickets {
    // Calculates total sales for one movie across months
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }
    
    // Determines the top performing movie
    // totalSales = {6200, 6300}
    // movies = {Napolean, Oppenheimer}
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int highest = 0;
        String topMovie = "";

        // Bubble sort
        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > highest) {
                highest = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;
    }
}
