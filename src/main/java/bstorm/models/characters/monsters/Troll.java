package bstorm.models.characters.monsters;

import bstorm.models.characters.Entity;
import bstorm.models.characters.loots.Gold;
import bstorm.models.properties.StatType;
import bstorm.utils.Dice;

public class Troll extends Monster implements Gold {

    private Integer gold;

    public Troll(){

        gold = Dice.D6.throwDice();
    }
    @Override
    public void hit(Entity target) {

        int damage = getStats().modifier(StatType.strength) + Dice.D4.throwDice();
        target.takeDamage(damage);
    }

    @Override
    public void generate(){

        getStats().appendStat(StatType.strength,3);
        super.generate();
    }

    @Override
    public Integer getGold() {
        return gold;
    }
}
