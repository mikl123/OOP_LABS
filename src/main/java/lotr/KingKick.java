package lotr;

import java.util.Random;

public class KingKick implements KickStr {
 private static Random rand = new Random();
    @Override
    public void kick(Character a, Character b) {
        int hp_dec = b.getHp() - rand.nextInt( a.getPower());
        b.setHp(hp_dec);
    }
    
}
