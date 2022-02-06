import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
public class Permutation {
    private static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String key;
    public Permutation(String key){
        this.key = key;
    }
    public String encrypt(String message){
        char[] temp = message.toCharArray();
        char[] encrypted = new char[temp.length];
        for(int i = 0; i < temp.length; i++){
            encrypted[i] = key.charAt(Permutation.alphabet.indexOf(temp[i]));
        }
        return String.valueOf(encrypted);
    }

    public String decrypt(String message){
        char[] temp = message.toCharArray();
        char[] decrypted = new char[temp.length];
        for(int i = 0; i < temp.length; i ++){
            decrypted[i] = Permutation.alphabet.charAt(key.indexOf(temp[i]));
        }
        return String.valueOf(decrypted);
    }
    static String genKey(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, Permutation.alphabet.length() );
        char[] key = new char[Permutation.alphabet.length()];
        for(int i = 0 ; i < Permutation.alphabet.length(); i++){
            randomNum = ThreadLocalRandom.current().nextInt(0, Permutation.alphabet.length() );
            while(Permutation.isinArray(key,Permutation.alphabet.charAt(randomNum))){
                randomNum = ThreadLocalRandom.current().nextInt(0, Permutation.alphabet.length() );
            }
            key[i] = Permutation.alphabet.charAt(randomNum);
        }
        return String.valueOf(key);

    }
    private static boolean isinArray(char[] key, char curr){
        for (char character : key){
            if(curr == character)
                return true;
        }
        return false;
    }
}
