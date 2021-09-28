package com.company;

public class Main {

    public static void printTile(Tile tile) {
        System.out.println(tile);
    }

    public static void main(String[] args) {
        Tile tile = new Tile(10, 'c');
        printTile(tile);
        Tile tile2 = new Tile(10, 'z');
        printTile(tile2);
        Tile tile3 = new Tile(10, 'z');
        printTile(tile3);
        System.out.println(tile.equals(tile2));
        System.out.println(tile2.equals(tile3));

    }
}
