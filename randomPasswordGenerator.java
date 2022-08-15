package devran;
import java.util.* ;
public class randomPasswordGenerator {
    static char[] getPassword(int l){
        String cap  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        String small = "abcdefghijklmnopqrstuvwxyz" ;
        String num = "1234567890" ;
        String sym = "!@#$%^&*()_+<>?:;{}[]" ; // this special symbols can be removed as it reduces
                                    // the  feasibility of the passwords generated for practical usage
        String val = cap+small +sym ;
        Random rand = new Random() ;
        char[] charArray = new char[l] ;
        for (int i = 0; i < l; i++) {
            charArray[i] = val.charAt(rand.nextInt(val.length())) ;

        }

        return charArray ;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in) ;
        System.out.println("Enter the number of digits required in the password : ");
        int l = Sc.nextInt() ; // length of the password
        System.out.print("The required password is : ");
        System.out.println(getPassword(l));
    }
}
