package dsetech.interview.boxes;

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
        final Boxes boxes = new Boxes(48);
        boxes.getBoxResult();

    }

    private BoxResult getBoxResult() {

        final int bigBoxes = totalItemsToStore / BOX_SIZE_LARGE;
        final int mediumBoxes = (totalItemsToStore - bigBoxes * BOX_SIZE_LARGE) / BOX_SIZE_MEDIUM;
        final int smallBoxes = ((totalItemsToStore - bigBoxes * BOX_SIZE_LARGE - mediumBoxes * BOX_SIZE_MEDIUM) + (BOX_SIZE_SMALL - 1)) / BOX_SIZE_SMALL;

        System.out.printf("big=%d, med=%d, small=%d%n", bigBoxes, mediumBoxes, smallBoxes);
        return new BoxResult(bigBoxes, mediumBoxes, smallBoxes);
    }
}
