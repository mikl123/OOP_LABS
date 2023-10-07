package lotr;

public class ElfKick implements KickStr{

    @Override
    public void kick(Character a, Character b) {
        if (b.getPower() <= a.getPower()){
            b.setHp(0);
           }else{
            a.power-=1;
           }
    }
    
}
