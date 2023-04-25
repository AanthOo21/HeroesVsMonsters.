package bstorm.utils;

import bstorm.models.characters.Entity;

public class GameMap {

    Entity[][] map;
    int line;
    int column;

    public GameMap(int line, int column) {
        this.line = line;
        this.column = column;
        this.map = new Entity[line][column];
    }


}
