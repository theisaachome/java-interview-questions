package com.isaachome.arrays;

public class PinValidator {
    public static void main(String[] args) {
        // Test cases
        String[] testPins = {"1234", "12345", "123456", "123a", "abcd", "1234567"};

        for (String pin : testPins) {
            System.out.println("PIN: " + pin + " is valid: " + isValidPIN(pin));
        }
    }
    static boolean isValidPIN(String pin){
        String reg = "^\\d{4}$|^\\d{6}";
        return pin.matches(reg);
    }
    static boolean isValidPINII(String pin){
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }
    public static boolean validatePin(String pin) {

        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    public static boolean validatePinII(String pin) {
        if (pin.length() == 4 || pin.length() == 6)
            return pin.chars().allMatch(Character::isDigit);
        return false;
    }

}
