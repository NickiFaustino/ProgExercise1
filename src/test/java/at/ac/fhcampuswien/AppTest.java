package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @DisplayName("Checks if password is valid when every requirement is met")
    @Test
    public void checkPassword(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo1593?");
        assertTrue(answer);
    }
    @DisplayName("Checks if password is invalid because it does not have enough characters but meets all requirements")
    @Test
    public void checkPassword2(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo#2");
        assertFalse(answer);
    }
    @DisplayName("Checks if password is invalid because it has too many characters but meets all requirements")
    @Test
    public void checkPassword3(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo#2aoiaAiu3()???$$$!!%");
        assertFalse(answer);
    }
    @DisplayName("Checks if the password is invalid because it has no numbers")
    @Test
    public void checkPassword4(){
        App password = new App();
        boolean answer = password.checkPassword("Asdasdasdasd#");
        assertFalse(answer);
    }
    @DisplayName("Checks if the password is invalid because it has no letters --> No uppercase or lowercase")
    @Test
    public void checkPassword5(){
        App password = new App();
        boolean answer = password.checkPassword("159368#???");
        assertFalse(answer);
    }
    @DisplayName("Checks if the password is invalid because it has no uppercase")
    @Test
    public void checkPassword6(){
        App password = new App();
        boolean answer = password.checkPassword("hallo1234#");
        assertFalse(answer);
    }
    @DisplayName("Checks if the password is invalid because it has no lowercase")
    @Test
    public void checkPassword7(){
        App password = new App();
        boolean answer = password.checkPassword("HALLO1234#");
        assertFalse(answer);
    }
    @DisplayName("Checks if the password is valid because it meets all requirements")
    @Test
    public void checkPassword8(){
        App password = new App();
        boolean answer = password.checkPassword("Hallo123434#");
        assertTrue(answer);
    }
    @DisplayName("Checks if the password is invalid because it has a different special character")
    @Test
    public void checkPassword9(){
        App password = new App();
        boolean answer=password.checkPassword("Hallo1593*");
        assertFalse(answer);
    }
    @DisplayName("Checks if the password is valid because it meets all requirements specifically test if uppercase in the middle stil leads to valid")
    @Test
    public void checkPassword10(){
        App password = new App();
        boolean answer = password.checkPassword("HalloAA123434#");
        assertTrue(answer);
    }
    @DisplayName("Checks if password is invalid because it has no special characters")
    @Test
    public void checkPassword11(){
        App password = new App();
        boolean answer = password.checkPassword("HalloAA123434");
        assertFalse(answer);
    }
    @DisplayName("Checks if password is invalid because it only has special characters")
    @Test
    public void checkPassword12(){
        App password = new App();
        boolean answer = password.checkPassword("???????????????????????");
        assertFalse(answer);
    }


}
