package lotr;

public class GameManager {
    public void fight(Character a, Character b) {
        if (a instanceof Hobbit && b instanceof Hobbit) {
            return;
        }
        while (true) {
            if (a.getHp() != 0) {
                a.kick(b);
                System.out.println(a.toString() + " attacks " + b.toString());

            } else {
                System.out.println(b.toString() + "   Wins!!!");
                return;
            }
            if (b.getHp() != 0) {
                b.kick(a);
                System.out.println(b.toString() + " attacks " + a.toString());

            } else {
                System.out.println(a.toString() + "   Wins!!!");
                return;
            }

        }
    }
}
