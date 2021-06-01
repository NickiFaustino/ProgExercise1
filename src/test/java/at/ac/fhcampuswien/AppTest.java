package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void checkPassword(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo1593?");
        assertTrue(answer);
    }

    @Test
    public void checkPassword2(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo#");
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
    @Test
    public void checkPassword5(){
        App password = new App();
        boolean answer = password.checkPassword("hallo1234");
        assertFalse(answer);
    }
    @Test
    public void checkPassword6(){
        App password = new App();
        boolean answer = password.checkPassword("HALLO1234");
        assertFalse(answer);
    }
    @Test
    public void checkPassword7(){
        App password = new App();
        boolean answer = password.checkPassword("Hallo123434#");
        assertTrue(answer);
    }
    @Test
    public void checkPassword8(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo1593*");
        assertFalse(answer);
    }
    @Test
    public void checkPassword9(){
        App password = new App();
        boolean answer = password.checkPassword("HalloAA123434#");
        assertTrue(answer);
    }



}
