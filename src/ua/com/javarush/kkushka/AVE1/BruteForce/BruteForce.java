package ua.com.javarush.kkushka.AVE1.BruteForce;


import static ua.com.javarush.kkushka.AVE1.Alphabet.Alphabet.alphabet;

import static ua.com.javarush.kkushka.AVE1.Coder.Coder.coder;

public class BruteForce {


    public static final String bruteForce(String message) {
        int key = 1;
        String decrypedText = "";
        while (key < alphabet.length()) {
            decrypedText +=  "ключ " + key + "  - " + coder(message, key) ;
            key += 1;
        }

        return decrypedText;
    }

}