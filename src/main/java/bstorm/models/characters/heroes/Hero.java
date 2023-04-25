package bstorm.models.characters.heroes;

import bstorm.models.characters.Entity;
import bstorm.models.characters.loots.Gold;
import bstorm.models.characters.loots.Leather;

public abstract class Hero extends Entity implements Gold, Leather {

    private String name;

    private Integer gold = 0;

    private Integer leather = 0;

    public Hero(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void loot(Entity target){

        if(target instanceof Gold g)
            gold += g.getGold();

        if(target instanceof Leather l)
            leather += l.getLeather();

        regen();
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
