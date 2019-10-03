
package main;

import util.MathUtils;


public class DiffieHellman {
    
    public long send(long n, long g, long x) throws Exception{
        
        if(!MathUtils.isPrimeNumber(n) 
                || !MathUtils.isPrimeNumber((n-1)/2))
            throw new Exception("not a prime number!");
  
        return ((long) Math.pow(g, x) % n);
        
    }
    
}
