package com.pcschool.ocp.game.case3;

public class PokerName {
    public static void main(String[] args) {
        // ♠ ♥ ♦ ♣
        // Black: \u001b[30m 
        // Red: \u001b[31m
        Poker p1 = new Poker("S", "A", "\u001b[30m", 1);
        Poker p2 = new Poker("H", "A", "\u001b[31m", 1);
        
        System.out.println(p1);
        System.out.println(p2);
    }
}