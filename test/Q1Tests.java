/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import Question1.MovieTickets;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author amber-mac
 */
public class Q1Tests {
    
    private final MovieTickets movieTickets = new MovieTickets();

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        int[] napoleonSales = {3000, 1500, 1700};
        int expected = 6200;
        int actual = movieTickets.TotalMovieSales(napoleonSales);
        assertEquals(expected, actual);
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};
        String expected = "Oppenheimer";
        String actual = movieTickets.TopMovie(movies, totalSales);
        assertEquals(expected, actual);
    }
}
