package HashValue;
import org.junit.jupiter.api.Test;
import static HashValue.HashValue.calculateSumme;
import static org.junit.jupiter.api.Assertions.*;

class HashValueTest {

    @Test
    void calculate_Summe_With_Positiv_Charakter_And_Positive_Multiplikator(){
        Character zeichen = 'A';
        int multiplikator = 3;
        long expected = 195;

        long actual = calculateSumme(zeichen,multiplikator);

        assertEquals(expected, actual);
    }

    @Test
    void calculate_Summe_With_Charakter_And_Positiv_Multiplikator(){
        Character zeichen = '-';
        int multiplikator = 5;
        long expected = 225;

        long actual = calculateSumme(zeichen, multiplikator);
        assertEquals(expected,actual);
    }
    @Test
    void calculate_Summe_With_Positive_Charakter_And_Negative_Multiplikator(){
        Character zeichen = 'B';
        int multiplikator = -2;
        long expected = -132;

        long actual = calculateSumme(zeichen,multiplikator);
        assertEquals(expected,actual);
    }

    @Test
    void calculate_HashValue_With_Leer_Char(){
        char zeichen = ' ';
        int multiplikator = 0;
        long expected = 0;

        long actual = calculateSumme(zeichen,multiplikator);
        assertEquals(expected,actual);
    }

}