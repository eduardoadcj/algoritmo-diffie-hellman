
package util;

public class CifraCesar {
    
    public static String encrypt(String data, int key) throws Exception{
        
        if(key == 0)
            throw new Exception("Key cant be zero!");
        
        String encryptedText = "";
        
        for (int i = 0; i < data.length(); i++) {
            int text = ((int) data.charAt(i)) + key;
            encryptedText += (char) text;
        }
        
        return encryptedText;
        
    }
    
    public static String decrypt(String data, int key) throws Exception{
        
        if(key == 0)
            throw new Exception("Key cant be zero!");
        
        String decryptedText = "";
        
        for (int i = 0; i < data.length(); i++) {
            int text = ((int) data.charAt(i) - key);
            decryptedText += (char) text;
        }
        
        return decryptedText;
        
    }
    
}
