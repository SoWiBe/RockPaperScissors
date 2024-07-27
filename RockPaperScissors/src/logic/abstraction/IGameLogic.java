package logic.abstraction;

import models.Field;
import models.Thing;

public interface IGameLogic {
    void getStartInfo();
    void getSecondInfo();
    void play(Field field);
    Thing setThing(int number);
}
