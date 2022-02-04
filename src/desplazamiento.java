public class desplazamiento{
    private int key;
    private static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public desplazamiento(int key) {
        this.key =  key;
    }
    public void change_key(int key){
        this.key = key;
    }

    String encrypt(String message) {
        char [] temp = message.toCharArray();
        char[] encrypted = new char[temp.length];
        for(int i = 0; i < temp.length; i++){
            int curr = alphabet.indexOf(temp[i]);
            encrypted[i] = alphabet.charAt((curr + key) % desplazamiento.alphabet.length());
        }
        return String.valueOf(encrypted);
    }

    String decrypt(String message) {
        int inverse = desplazamiento.alphabet.length() - this.key;
        char [] temp = message.toCharArray();
        char[] encrypted = new char[temp.length];
        for(int i = 0; i < temp.length; i++){
            int curr =  alphabet.indexOf(temp[i]);
            encrypted[i] = alphabet.charAt((curr + inverse) % desplazamiento.alphabet.length());
        }
        return String.valueOf(encrypted);
    }
}
