
package util;

public class MathUtils {
    
    public static boolean isPrimeNumber(long n){
        
        if(n <= 0l)
            return false;
        
        if(n <= 2)
            return true;
        
        long square = (long) Math.sqrt(n);
        
        for (int i = 2; i < square; i++) {
            if(n%1 == 0 && i<n){
               return false;
            }
        }
        
        return true;
        
    }
    
}
