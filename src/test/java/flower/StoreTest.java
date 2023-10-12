
package flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flowers.Filter;
import flowers.Flower;
import flowers.FlowerType;
import flowers.PriceFilter;
import flowers.Store;
import flowers.Thing;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    Store store;
    @BeforeEach
    public void init(){
     store = new Store();
    }
    @Test
    public void testStore() {
    Flower rose = new Flower(FlowerType.ROSE);
    Flower tulip = new Flower(FlowerType.TULIP);
    Flower cmamomile = new Flower(FlowerType.CHAMOMILE);
    store.addToStore(cmamomile);
    store.addToStore(tulip);
    store.addToStore(rose);
    Filter filterPrice = new PriceFilter(40);
    List<Thing> matched = new ArrayList<>();
    matched.add(tulip);
    matched.add(cmamomile);
    Assertions.assertEquals(matched,store.findInStore(filterPrice));
    }
}
