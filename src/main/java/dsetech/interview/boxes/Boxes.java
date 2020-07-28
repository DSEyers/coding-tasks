package dsetech.interview.boxes;

import java.lang.reflect.Array;

public class Boxes {

    // Large box holds 20
    // Medium 10
    // Small 5
    final int BOX_SIZE_LARGE = 20;
    final int BOX_SIZE_MEDIUM = 10;
    final int BOX_SIZE_SMALL = 5;
    final int totalItemsToStore;

    Boxes(final int totalItemsToStore) {
        this.totalItemsToStore = totalItemsToStore;
    }

    public static void main(String[] args) {
        final Boxes boxes = new Boxes(52);
        boxes.getBoxResult();

    }

    private BoxResult getBoxResult() {
        int bigBoxes = totalItemsToStore / BOX_SIZE_LARGE;
        int mediumBoxes = (totalItemsToStore - bigBoxes * BOX_SIZE_LARGE) / BOX_SIZE_MEDIUM;
        int smallBoxes = ((totalItemsToStore - bigBoxes * BOX_SIZE_LARGE - mediumBoxes * BOX_SIZE_MEDIUM) + 4) / BOX_SIZE_SMALL;

        System.out.println(String.format("big=%d, med=%d, small=%d", bigBoxes, mediumBoxes, smallBoxes));


        return null;
    }
}
