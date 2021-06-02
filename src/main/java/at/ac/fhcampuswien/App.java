package at.ac.fhcampuswien;

public class App {
    int length=0;
    int letcount = 0;
    int numbcount = 0;
    int uppercount = 0;
    int lowercount = 0;
    int specialcount = 0;
    char previous;
    char first;
    int counter;
    int toomany;


    public boolean checkPassword(String password){
       // if(password.length()>28 && password.length()<8) {
         //   return false;
        //}
        for(int i = 0; i < password.length(); i++){
            char word =  password.charAt(i);

            if (isNumeric(word)){
                numbcount++;
                length++;
                char c = password.charAt(i);
                if (previous == c){
                    counter++;
                }else{
                    counter = 1;
                }
                if(counter > 2){
                    return false;
                }
                previous = c;
                char g = password.charAt(i);
                if (first +1 == g ){
                    toomany++;
                }
                else {
                    toomany=1;
                }
                if (toomany > 2){
                    return false;
                }
                first = g;
            }
            if (isLetter(word)){
                letcount++;
                length++;
            }
            if (isUpper(word)){
                uppercount++;
            }
            if (isLower(word)){
                lowercount++;
            }
            if (isSpecial(word)){
                specialcount++;
                length++;
            }
        }

        if (numbcount > 0 && letcount > 0 && uppercount > 0 && lowercount > 0 && specialcount >0 && length > 8 && length < 25){
            return true;

            //if (uppercount >0 && lowercount >0){
            //  return true;
        }else{
            return false;
        }


    }

    public static boolean isNumeric(char word) {
        return (word >= '0' && word <= '9');
    }
    public static boolean isLetter(char word) {
        return (word >= 'A' && word <= 'Z' || word >= 'a' && word <= 'z');
    }
    public static boolean isUpper(char word){
        return (word >=65&& word <= 90);
    }
    public static boolean isLower(char word){
        return (word >=97&& word <= 122);
    }
    public static boolean isSpecial(char word){
        return (word =='('|| word == ')'|| word =='#'||  word == '$'|| word =='?'||word == '!'|| word =='%'|| word =='/'||  word == '@');
    }

    public static void main(String[] args) {

    }
}