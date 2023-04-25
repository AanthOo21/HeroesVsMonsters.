package bstorm;

import bstorm.models.characters.heroes.Hero;
import bstorm.models.characters.heroes.Warrior;
import bstorm.models.characters.monsters.Dragon;
import bstorm.models.characters.monsters.Monster;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Warrior("Rocky");
        Monster monster = new Dragon();

        monster.addDieSubscriber(entity -> hero.loot(entity));

        while(hero.isAlive() && monster.isAlive()){

            hero.hit(monster);

            if(monster.isAlive())
                monster.hit(hero);

            System.out.println("Hero : " + hero.getCurrentHp() + "\nMonstre : " + monster.getCurrentHp());
        }
        System.out.println("--Inventaire--\nGold : " + hero.getGold() + "\nCuir : " + hero.getLeather());
        System.out.println("Hero : " + hero.getCurrentHp());

    }
}