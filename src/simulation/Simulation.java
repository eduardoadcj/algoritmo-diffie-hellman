
package simulation;


public class Simulation {
    
    public static void main(String[] args) {
        
        Pessoa alice = new Pessoa();
        alice.nome = "Alice";
        alice.g = 3;
        alice.n = 5;
        alice.xy = 7;
        
        Pessoa bob = new Pessoa();
        bob.nome = "Bob";
        bob.g = 3;
        bob.n = 5;
        bob.xy = 8;
        
        alice.sendKey(bob);
        alice.send("Meu nome não é Jonny", bob);
        
    }
    
}
