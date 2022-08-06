package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] charName = name.toCharArray();
        if (!name.isEmpty() && isLowerLatinLetter(name.charAt(0))) {
            for (char chars : charName) {
                if (isSpecialSymbol(chars) || isUpperLatinLetter(chars) || isLowerLatinLetter(chars) || Character.isDigit(chars)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}