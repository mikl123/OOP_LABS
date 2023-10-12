package flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import flowers.Flower;
import flowers.FlowerBucket;
import flowers.FlowerPack;
import flowers.FlowerType;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    @Test
    public void testPack() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        Assertions.assertEquals(price * quantity, flowerPack.getPrice());
    }
    @Test
    public void testBucket() {

        Flower flower1 = new Flower(FlowerType.CHAMOMILE);
        FlowerPack flowerPack1 = new FlowerPack(flower1, 3);

        Flower flower2 = new Flower(FlowerType.ROSE);
        FlowerPack flowerPack2 = new FlowerPack(flower2, 5);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(flowerPack1);
        bucket.addFlowerPack(flowerPack2);

        Assertions.assertEquals(flowerPack1.getPrice() + flowerPack2.getPrice(), bucket.getPrice());
    }
}
