public class cryptotool {
    public static void main(String args[]){
        Afin test = new Afin(7,11);
        System.out.println(test.encrypt("HELLO"));
        System.out.println(test.decrypt(test.encrypt("HELLO")));
    }
}
