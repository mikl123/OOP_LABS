package lotr;


public class Hobbit extends Character {

    public Hobbit(int hp, int power) {
        super(new NoKick(),hp, power);
    }
    public Hobbit() {
        super(new NoKick(),3, 0);
    }

    @Override
    public void kick(Character a) {
        System.out.println("Cryyyyy(((((");
    }

    public String toString() {
        return super.toString("Hobbit");
    }
}