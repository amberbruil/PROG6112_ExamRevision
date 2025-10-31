/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Question2.IMovieTickets;
import Question2.MovieTicketData;
import Question2.MovieTickets;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author amber-mac
 */
public class Q2Tests {
     @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        IMovieTickets service = new MovieTickets();
        double total = service.CalculateTotalTicketPrice(3, 100.00);
        assertEquals(345.00, total);
    }

    @Test
    public void Validation_InvalidWhenMovieNameBlank() {
        IMovieTickets service = new MovieTickets();
        MovieTicketData bad = new MovieTicketData("   ", 2, 120.00);
        assertEquals(false, service.ValidateData(bad));
    }
}
