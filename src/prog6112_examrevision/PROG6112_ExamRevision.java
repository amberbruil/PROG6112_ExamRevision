/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog6112_examrevision;

/**
 *
 * @author amber-mac
 */
public class PROG6112_ExamRevision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] movies = {"Napoleon", "Oppenheimer"};
         
        // Jan, Feb, Mar
        int[][] sales = {
            {3000, 1500, 1700}, // Napoleon
            {3500, 1200, 1600}  // Oppenheimer
        };

        MovieTickets logic = new MovieTickets(); // Instantiate MovieTickets
        int[] totals = new int[movies.length]; // total sales (2) for each movie
        
        // Calculate per-movie totals
        // Each row gets passed to TotalMovieSales method
        for (int i = 0; i < movies.length; i++) {
            totals[i] = logic.TotalMovieSales(sales[i]);
        } // totals = {6200, 6300}

        // REPORT
        System.out.println("MOVIE TICKET SALES REPORT - 2024 ");
        System.out.printf("\n %20s %8s %8s %10s%n", "JAN", "FEB", "MAR", "TOTAL");
        System.out.println("------------------------------------------------------");

        // print the sales for each month
        for (int i = 0; i < movies.length; i++) 
        {
            System.out.printf("%-12s %8d %8d %8d %10d%n",
                    movies[i], sales[i][0], sales[i][1], sales[i][2], totals[i]);
        }
        
        System.out.println("");
        
        // print the total sales for each movie
        for (int i = 0; i < totals.length; i++) 
        {
            System.out.println("Total movie ticket sales for " + movies[i]
            + " "+ totals[i]);
        }

        // Top performing movie
        String top = logic.TopMovie(movies, totals);
        System.out.println("\nTop Performing Movie: " + top);
    }
}
    