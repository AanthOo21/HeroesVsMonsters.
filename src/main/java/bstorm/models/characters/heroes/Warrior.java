package bstorm.models.characters.heroes;

import bstorm.models.characters.Entity;
import bstorm.models.properties.StatType;
import bstorm.utils.Dice;

public class Warrior extends Hero{

    public Warrior(String name) {

        super(name);
    }

    @Override
    public void hit(Entity target) {

        int damage = getStats().modifier(StatType.strength) + Dice.D4.throwDice();
        target.takeDamage(damage);

        super.hit(target);
    }

    @Override
    protected void generate(){

        getStats().appendStat(StatType.strength,5);
        getStats().appendStat(StatType.vigor,5);
        super.generate();
    }
}