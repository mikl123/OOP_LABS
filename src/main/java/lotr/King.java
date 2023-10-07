package lotr;

import java.util.Random;

public class King extends Character {
    private static Random rand = new Random();

    public King() {
        super(new KingKick(),rand.nextInt( 10) + 5, rand.nextInt( 10) + 5);
    }

    @Override
    public void kick(Character a) {
     this.kickRealisation.kick(this, a);  
    }
}