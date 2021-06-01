package at.ac.fhcampuswien;

public class App {
    public boolean checkPassword(String password){
        if(password.length()>28||password.length()<8){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
