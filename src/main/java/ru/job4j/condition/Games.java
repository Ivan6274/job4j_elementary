package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent == true && hasMoney == true) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}