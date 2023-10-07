package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Character {
    protected KickStr kickRealisation;
    protected int hp = 0;
    protected int power = 0;
    
    public abstract void kick(Character a);

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }
    public String toString(String class_name){
    return class_name +"{hp="+ this.hp+", power="+this.power+"}" ;
    }
}