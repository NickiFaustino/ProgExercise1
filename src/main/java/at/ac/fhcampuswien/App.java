package at.ac.fhcampuswien;

public class App {
    int letcount = 0;
    int numbcount = 0;

    public boolean checkPassword(String password){
        if(password.length()>28 && password.length()<8) {
            return false;
        }

        for(int i = 0; i < password.length(); i++){
            char word =  password.charAt(i);

            if (isNumeric(word)){
                numbcount++;
            }
            else if(isLetter(word)){
                letcount++;
            }

        }
        if (numbcount > 0 && letcount > 0){
            return true;
        }
    return false;
    }

    public static boolean isNumeric(char word) {
        return (word >= '0' && word <= '9');
    }
    public static boolean isLetter(char word) {
        word = Character.toUpperCase(word);
        return (word >= 'A' && word <= 'Z');
    }

    public static void main(String[] args) {

    }
}
