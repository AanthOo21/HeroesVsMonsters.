package bstorm.models.interfaces;

import bstorm.models.characters.Entity;

public interface DieSubscriber {
    void execute(Entity entity);
}
