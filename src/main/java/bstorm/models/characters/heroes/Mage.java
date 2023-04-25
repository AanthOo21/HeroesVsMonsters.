package bstorm.models.characters.heroes;

import bstorm.models.characters.Entity;
import bstorm.models.properties.StatType;
import bstorm.utils.Dice;

public class Mage extends Hero{

    public Mage(String name) {

        super(name);
    }

    @Override
    public void hit(Entity target) {

        int damage = getStats().modifier(StatType.intelligence) + Dice.D4.throwDice();
        target.takeDamage(damage);

        super.hit(target);
    }

    @Override
    protected void generate(){

        getStats().appendStat(StatType.intelligence,5);
        getStats().appendStat(StatType.mind,5);
        super.generate();
    }
}
