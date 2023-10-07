package lotr;




public class Elf extends Character {
   public Elf(){
    super(new ElfKick(),10,10);
   }
   public Elf(int hp, int power){
    super(new ElfKick(),hp,power);
   }

    @Override
    public void kick(Character a) {
      this.kickRealisation.kick(this, a);
    }
    public String toString(){
       return super.toString("Elf");
    }
}