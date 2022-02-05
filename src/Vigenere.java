public class Vigenere {
    private String key;
    private static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Vigenere(String key){
        this.key = key;
    }
    public void change_key(String key){
        this.key = key;
    }
    public String encrypt(String message){
        char[] temp = message.toCharArray();
        char[] encrypted = new char[temp.length];
        desplazamiento en = new desplazamiento(0);
        for(int i = 0; i < temp.length; i++){
            int pos = i % this.key.length();
            en.change_key(Vigenere.alphabet.indexOf(key.charAt(pos)));
            encrypted[i] = en.encrypt(String.valueOf(temp[i])).charAt(0);
        }
        return String.valueOf(encrypted);
    }
    public String decrypt(String message){
        char[] temp = message.toCharArray();
        char[] decrypted = new char[temp.length];
        desplazamiento en = new desplazamiento(0);
        for(int i = 0; i < temp.length; i++){
            int pos = i % this.key.length();
            en.change_key(Vigenere.alphabet.indexOf(key.charAt(pos)));
            decrypted[i] = en.decrypt(String.valueOf(temp[i])).charAt(0);
        }
        return String.valueOf(decrypted);
    }
}
