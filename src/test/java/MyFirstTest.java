import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void verifyString(){
        assertNotEquals("CodeUp", "Codeup");
    }

    @Test
    public void verifyArrayListsDifferent(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages,moreLanguages);
    }
    @Test
    public void testArraysEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);
    }
    @Test
    public void testPHPContains(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
}

