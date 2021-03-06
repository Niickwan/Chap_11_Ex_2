package com.company;

public class Tile {
    private int value;
    private char letter;

    Tile(int value, char letter) {
        this.value = value;
        this.letter = letter;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getLetter(){
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String toString() {
        return "Tile: " + this.letter + " is " + this.value + " points";
    }

    public boolean equals(Tile that) {
        return value == that.value && letter == that.letter;
    }
}
