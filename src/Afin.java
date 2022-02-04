public class Afin {
    private int[] key;
    private static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Afin(int p, int q){
        this.key = new int[] {p , q};
    }
    public String encrypt(String message){
        int a = this.key[0];
        int b = this.key[1];
        char[] temp = message.toCharArray();
        char[] encrypted = new char[temp.length];
        for(int i = 0; i < encrypted.length; i++){
            int curr = Afin.alphabet.indexOf(temp[i]);
            encrypted[i] = Afin.alphabet.charAt((a * curr + b) % Afin.alphabet.length());
        }
        return String.valueOf(encrypted);
    }
    private static int findInverse(int b){
        int inverse = 0;
        for(int i = 1; i  < Afin.alphabet.length(); i++){
            if((i * b) % Afin.alphabet.length() == 1){
                inverse = i;
            }
        }
        return inverse;
    }
    public String decrypt(String message){
        int inverse_b = Afin.alphabet.length() - this.key[1];
        int inverse_a = Afin.findInverse(this.key[0]);
        char[] temp = message.toCharArray();
        char[] decrypted = new char[temp.length];
        for(int i = 0; i < temp.length; i++){
            int curr = Afin.alphabet.indexOf(temp[i]);
            decrypted[i] = Afin.alphabet.charAt((inverse_a * ( curr + inverse_b)) % Afin.alphabet.length());
        }
        return String.valueOf(decrypted);
    }
}
