public class cryptotool {
    public static void main(String[] args){
        Vigenere test = new Vigenere("ABSENTA");
        System.out.println(test.encrypt("HELLO"));
        System.out.println(test.decrypt(test.encrypt("HELLO")));
        int[] numbers = {1,2};
    }
}
