package com.techelevator.trees;

import org.junit.*;

public class FruitTreeTest {

    private final static int STARTING_NUMBER_OF_FRUIT = 7;
    private FruitTree fruitTree;

    @Before
    public void setup() {
        fruitTree = new FruitTree("Peach",STARTING_NUMBER_OF_FRUIT);
    }

    @Test
    public void pick_fruit_from_tree() {
        // Arrange
        // Act
        boolean isSuccess = fruitTree.pickFruit(2);
        // Assert
        Assert.assertTrue("pickFruit returned False", isSuccess);
        Assert.assertEquals("wrong number of fruit remaining", 5, fruitTree.getPiecesOfFruitLeft() );
    }

    @Test
    public void pick_fruit_from_empty_tree() {
        // Arrange
        fruitTree.pickFruit(STARTING_NUMBER_OF_FRUIT);
        // Act
        boolean isSuccess = fruitTree.pickFruit(1);
        // Assert
        Assert.assertFalse("pickFruit returned True", isSuccess);
        Assert.assertEquals("wrong number of fruit remaining", 0, fruitTree.getPiecesOfFruitLeft());

    }

    @Test
    public void pick_negative_number_of_fruit() {
        // Arrange
        // Act
        boolean isSuccess = fruitTree.pickFruit(-1);
        // Assert
        Assert.assertEquals(STARTING_NUMBER_OF_FRUIT, fruitTree.getPiecesOfFruitLeft() );
        Assert.assertFalse("pickFruit returned True", isSuccess);

    }

    @Test
    public void pick_too_many_fruit() {
        // Arrange
        // Act
        boolean isSuccess = fruitTree.pickFruit(8);
        // Assert
        Assert.assertEquals(STARTING_NUMBER_OF_FRUIT, fruitTree.getPiecesOfFruitLeft() );
        Assert.assertFalse("pickFruit returned True", isSuccess);

    }

    @Test
    public void pick_zero_fruit() {
        // Arrange
        // Act
        boolean isSuccess = fruitTree.pickFruit(0);
        // Assert
        Assert.assertEquals(STARTING_NUMBER_OF_FRUIT, fruitTree.getPiecesOfFruitLeft() );
        Assert.assertFalse("pickFruit returned True", isSuccess);

    }

    @Test
    public void pick_all_the_fruit() {
        // Arrange
        // Act
        boolean isSuccess = fruitTree.pickFruit(STARTING_NUMBER_OF_FRUIT);
        // Assert
        Assert.assertEquals(0, fruitTree.getPiecesOfFruitLeft() );
        Assert.assertTrue("pickFruit returned False", isSuccess);

    }

    @Test
    public void pick_fruit_multiple_times() {
        // Arrange
        fruitTree.pickFruit(2);

        // Act
        boolean isSuccess = fruitTree.pickFruit(2);

        // Assert
        Assert.assertEquals(3, fruitTree.getPiecesOfFruitLeft() );
        Assert.assertTrue(isSuccess);
    }
}
