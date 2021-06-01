package at.ac.fhcampuswien;

public class App {
    int letcount = 0;
    int numbcount = 0;
    int uppercount = 0;
    int lowercount = 0;
    int specialcount = 0;


    public boolean checkPassword(String password){
        if(password.length()>28 && password.length()<8) {
            return false;
        }
        for(int j = 0; j <password.length(); j++){
            char ch = password.charAt(j);
            if (isUpper(ch)){
                uppercount++;
            }
            else if (isLower(ch)){
                lowercount++;
            }
            else if (isSpecial(ch)){
                specialcount++;
            }
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

        if (numbcount > 0 && letcount > 0 && uppercount > 0 && lowercount > 0 && specialcount >0){
            return true;
        }else{
            return false;
        }


    }

    public static boolean isNumeric(char word) {
        return (word >= '0' && word <= '9');
    }
    public static boolean isLetter(char word) {
        word = Character.toUpperCase(word);
        return (word >= 'A' && word <= 'Z');
    }
    public static boolean isUpper(char ch){
        return (ch >=65&& ch <= 90);
    }
    public static boolean isLower(char ch){
        return (ch >=97&& ch <= 122);
    }
    public static boolean isSpecial(char ch){
        return (ch =='('|| ch == ')'|| ch =='#' || ch == '$'|| ch =='?'||ch == '!'|| ch =='%' || ch =='/' || ch == '@');
    }

    public static void main(String[] args) {

    }
}
