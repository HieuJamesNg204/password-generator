package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Generator {
    public static String generatePassword(int length) {
        final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
        final String DIGITS = "0123456789";
        final String SPECIAL_CHARS = "!@#$%^&*()-_=+<>?";

        Random random = new Random();

        StringBuilder passwordBuilder = new StringBuilder();
        passwordBuilder.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        passwordBuilder.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        passwordBuilder.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        passwordBuilder.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

        String allChars = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARS;
        for (int i = 4; i < length; i++) {
            passwordBuilder.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return shuffleString(passwordBuilder.toString());
    }

    private static String shuffleString(String input) {
        List<String> chars = Arrays.asList(input.split(""));
        Collections.shuffle(chars);

        StringBuilder shuffledString = new StringBuilder();
        for (String c : chars) {
            shuffledString.append(c);
        }
        return shuffledString.toString();
    }
}