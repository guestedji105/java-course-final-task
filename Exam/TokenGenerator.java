package Exam;

import java.util.Random;

public class TokenGenerator {

    static String generateRandomToken(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder token = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            token.append(characters.charAt(index));
        }

        return token.toString();
    }
}
