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
        boolean answer=password.checkPassword("Hallo");
        assertFalse(answer);
    }

    @Test
    public void checkPassword3(){
        App password = new App();
        boolean answer = password.checkPassword("asdasdasdasd");
        assertFalse(answer);
    }

    @Test
    public void checkPassword4(){
        App password = new App();
        boolean answer = password.checkPassword("123123123123");
        assertFalse(answer);
    }

}
