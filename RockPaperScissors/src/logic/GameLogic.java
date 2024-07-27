package logic;

import logic.abstraction.IGameLogic;
import models.Field;
import models.Thing;

public class GameLogic implements IGameLogic {

    public GameLogic(){
    }

    @Override
    public void getStartInfo() {
        System.out.println("Please choose your first thing by number");
        System.out.println("0 - Paper");
        System.out.println("1 - Rock");
        System.out.println("2 - Scissors");
        System.out.print("just write and press enter:");
    }

    @Override
    public void getSecondInfo() {
        System.out.print("and just write one more thing: ");
    }

    @Override
    public void play(Field field) {
        var firstThing = field.getFirstThing();
        var secondThing = field.getSecondThing();
        System.out.print("FirstThing is " + firstThing + ", and second thing is " + secondThing + "\n");

        if(firstThing == Thing.Paper && secondThing == Thing.Rock)
            System.out.println("Winner is " + Thing.Paper);
        else if(firstThing == Thing.Paper && secondThing == Thing.Scissors)
            System.out.println("Winner is " + Thing.Scissors);
        else if(firstThing == Thing.Rock && secondThing == Thing.Paper)
            System.out.println("Winner is " + Thing.Paper);
        else if(firstThing == Thing.Rock && secondThing == Thing.Scissors)
            System.out.println("Winner is " + Thing.Rock);
        else if(firstThing == Thing.Scissors && secondThing == Thing.Paper)
            System.out.println("Winner is " + Thing.Scissors);
        else if(firstThing == Thing.Scissors && secondThing == Thing.Rock)
            System.out.println("Winner is " + Thing.Rock);
    }

    @Override
    public Thing setThing(int number) {
        return switch (number) {
            case 0 -> Thing.Paper;
            case 1 -> Thing.Rock;
            default -> Thing.Scissors;
        };
    }
}
