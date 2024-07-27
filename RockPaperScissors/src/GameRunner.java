import logic.GameLogic;
import models.Field;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {

        var gameLogic = new GameLogic();
        var scanner = new Scanner(System.in);

        gameLogic.getStartInfo();
        var firstInput = scanner.nextInt();

        gameLogic.getSecondInfo();;
        var secondInput = scanner.nextInt();

        var firstThing = gameLogic.setThing(firstInput);
        var secondThing = gameLogic.setThing(secondInput);

        gameLogic.play(new Field(firstThing, secondThing));
    }
}