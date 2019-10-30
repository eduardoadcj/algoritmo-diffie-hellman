
package simulation;

import util.DiffieHellman;
import util.CifraCesar;

public class Pessoa {
    
    String nome;
    long n;
    long g;
    long xy;
    
    long key;
    
    public void sendKey(Pessoa pessoa){
        try{
            DiffieHellman df = new DiffieHellman();
            long temp = pessoa.receiveKey(df.send(n, g, xy));
            key = df.reveal(temp, xy, n);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public long receiveKey(long key){
        try{
            DiffieHellman df = new DiffieHellman();
            long temp = df.send(n, g, xy);
            this.key = df.reveal(key, xy, n);
            return temp;
        }catch(Exception e){
            System.err.println(e.getMessage());
            return 0;
        }
    }
    
    public void send(String message, Pessoa pessoa){
        
        try{
            if(key != 0){
                message = CifraCesar.encrypt(message,(int) this.key);
                System.out.println(nome+" enviou a mensagem: "+message);
                pessoa.receive(message);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void receive(String message){
        try{
            if(key != 0){
                message = CifraCesar.decrypt(message,(int) this.key);
                System.out.println(nome+" recebeu a mensagem: "+message);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
