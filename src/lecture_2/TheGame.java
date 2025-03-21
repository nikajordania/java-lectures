package lecture_2;

import lecture_2.enheretence.Goblin;
import lecture_2.enheretence.Human;
import lecture_2.enheretence.Zombie;

public class TheGame {


    public static void main(String[] args) {
        Goblin goblin = new Goblin(17, "Green Goblin", 3, "Sword", 80);
        Zombie zombie = new Zombie();
        Human human = new Human("Nika", 0);

        goblin.fight();

    }

}
