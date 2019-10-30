package util;

import java.util.logging.Level;
import java.util.logging.Logger;
import util.MathUtils;

public class DiffieHellman {

    public long send(long n, long g, long x) throws Exception {
        if (!verifyN(n)) {
            throw new Exception("not a prime number!");
        }
        return ((long) Math.pow(g, x) % n);
    }

    public long reveal(long r, long x, long n){
        return ( (long) Math.pow(r, x)) % n;
    }
    
    public boolean verifyN(long n) {
        if (!MathUtils.isPrimeNumber(n)
                || !MathUtils.isPrimeNumber((n - 1) / 2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        DiffieHellman dh = new DiffieHellman();
        
        long n = 5;
        long g = 3;
        long x = 7;
        long y = 8;
        
        try {
            
            long rx = dh.send(n, g, x);
            long ry = dh.send(n, g, y);
            
            System.out.println(rx);
            System.out.println(ry);
            
            System.out.println(dh.reveal(ry, x, n));
            System.out.println(dh.reveal(rx, y, n));
            
        } catch (Exception ex) {
            Logger.getLogger(DiffieHellman.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
