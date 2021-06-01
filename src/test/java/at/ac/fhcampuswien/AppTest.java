package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void checkPassword(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo1593");
        assertTrue(answer);
    }

    @Test
    public void checkPassword2(){
        App password = new App();
        boolean answer=password.checkPassword("Ich");
        assertFalse(answer);
    }
}
