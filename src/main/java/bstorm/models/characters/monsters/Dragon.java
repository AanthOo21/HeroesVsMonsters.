package bstorm.models.characters.monsters;

import bstorm.models.characters.Entity;
import bstorm.models.characters.loots.Gold;
import bstorm.models.characters.loots.Leather;
import bstorm.models.properties.StatType;
import bstorm.utils.Dice;

public class Dragon extends Monster implements Gold, Leather {

    private Integer gold;

    private Integer leather;

    public Dragon(){
        gold = Dice.D10.throwDice();
        leather = Dice.D10.throwDice();
    }

    @Override
    public void hit(Entity target) {

        int damage = getStats().modifier(StatType.intelligence) + Dice.D4.throwDice();
        target.takeDamage(damage);
    }

    @Override
    public void generate(){

        getStats().appendStat(StatType.intelligence,3);
        super.generate();
    }

    @Override
    public Integer getGold() {
        return gold;
    }

    @Override
    public Integer getLeather() {
        return leather;
    }
}
