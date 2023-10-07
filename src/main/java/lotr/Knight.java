package lotr;

import java.util.Random;


public class Knight extends Character{
    private static Random rand = new Random();
    public Knight() {
        super(new KingKick(),rand.nextInt(5, 12), rand.nextInt(5, 12));
    }
    @Override
    public void kick(Character a) {
     this.kickRealisation.kick(this, a);  
    }
}