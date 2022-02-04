public class cryptotool {
    public static void main(String args[]){
        desplazamiento test = new desplazamiento(0);
        System.out.println(test.encrypt("HELLO"));
        System.out.println(test.decrypt(test.encrypt("HELLO")));
        Vigenere test2 = new Vigenere("RICARDO");
        System.out.println(test2.encrypt("HELLO"));
        System.out.println(test2.decrypt(test2.encrypt("HELLO")));
    }
}
