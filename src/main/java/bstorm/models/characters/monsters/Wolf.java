package bstorm.models.characters.monsters;

import bstorm.models.characters.Entity;
import bstorm.models.characters.loots.Leather;
import bstorm.models.properties.StatType;
import bstorm.utils.Dice;

public class Wolf extends Monster implements Leather {

    private Integer leather;

    public Wolf(){

        leather = Dice.D6.throwDice();
    }

    @Override
    public void hit(Entity target) {

        int damage = getStats().modifier(StatType.dexterity) + Dice.D4.throwDice();
        target.takeDamage(damage);
    }

    @Override
    public void generate(){

        getStats().appendStat(StatType.dexterity,3);
        super.generate();
    }

    @Override
    public Integer getLeather() {
        return leather;
    }
}
