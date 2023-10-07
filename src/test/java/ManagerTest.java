import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Character;
import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }
    @Test
    public void testKick() {
        Hobbit hobbit = new Hobbit();
        Hobbit hobbit1 = new Hobbit();
        int hobbitHP = hobbit.getHp();
        int hobbit1HP = hobbit1.getHp();
        GameManager game = new GameManager();
        game.fight(hobbit, hobbit1);
        assertEquals(hobbit.getHp(),hobbitHP);
        assertEquals(hobbit1.getHp(),hobbit1HP);
    }
    @Test
    public void testKick1() {
        Elf elf = new Elf();
        Elf elf1 = new Elf();
        int elfHP = elf.getHp();
        int elf1HP = elf1.getHp();
        GameManager game = new GameManager();
        game.fight(elf1, elf1);
        assertEquals(elf.getHp(),elfHP);
        assertEquals(elf1.getHp(),0);
    }
}

