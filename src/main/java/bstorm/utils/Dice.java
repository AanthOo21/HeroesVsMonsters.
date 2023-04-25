package bstorm.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public enum Dice {

    D4(4),
    D6(6),
    D7(7),
    D10(10),
    D20(20),
    D100(100);

    private final Integer nbFaces;

    Dice(Integer nbFaces) {

        this.nbFaces = nbFaces;
    }

    public Integer throwDice(){

        Random rng = new Random();
        return rng.nextInt(this.nbFaces) + 1;
    }

    public Integer throwDices(Integer nbThrows, Integer nbToKeep){

        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < nbThrows; i++){
            ints.add(throwDice());
        }

        return ints.stream()
                .sorted(Comparator.reverseOrder())
                .limit(nbToKeep)
                .mapToInt(it -> it)
                .sum();
    }

    public Integer throwDices(Integer nbThrows){

        return throwDices(nbThrows,nbThrows);
    }

    public Integer throwDices(){

        return throwDices(5,3);
    }
}
