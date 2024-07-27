package models;

public class Field {
    private Thing firstThing;
    private Thing secondThing;

    public Field(Thing firstThing, Thing secondThing) {
        this.firstThing = firstThing;
        this.secondThing = secondThing;
    }

    public Thing getFirstThing() {
        return firstThing;
    }

    public void setFirstThing(Thing firstThing) {
        this.firstThing = firstThing;
    }

    public Thing getSecondThing() {
        return secondThing;
    }

    public void setSecondThing(Thing secondThing) {
        this.secondThing = secondThing;
    }
}
