package com.orangehrm.utilities;

public class GenerateRandomNumber {
    public static String getRandomNumber()
    {
        // Generate 2 digits number
        int randomNumber = (int) (Math.random() * 100);
        String randomNumberInput = String.valueOf(randomNumber);
        return randomNumberInput;
    }
}
