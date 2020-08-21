package dsetech.interview.boxes;

public class BoxResult {
    int boxesLarge = 0;
    int boxesMedium = 0;
    int boxesSmall = 0;

    public BoxResult() {
    }

    public BoxResult(int boxesLarge, int boxesMedium, int boxesSmall) {
        this.boxesLarge = boxesLarge;
        this.boxesMedium = boxesMedium;
        this.boxesSmall = boxesSmall;
    }

    public int getBoxesLarge() {
        return boxesLarge;
    }

    public void setBoxesLarge(int boxesLarge) {
        this.boxesLarge = boxesLarge;
    }

    public int getBoxesMedium() {
        return boxesMedium;
    }

    public void setBoxesMedium(int boxesMedium) {
        this.boxesMedium = boxesMedium;
    }

    public int getBoxesSmall() {
        return boxesSmall;
    }

    public void setBoxesSmall(int boxesSmall) {
        this.boxesSmall = boxesSmall;
    }
}