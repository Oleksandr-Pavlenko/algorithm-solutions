package com.algorithmen.dynamicprogramming;

import java.util.HashMap;

public class MaximumScoreWordsFormedByLetters {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char letter : letters) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        return backtrack(words, letterCount, score, 0);
    }

    private int backtrack(String[] words, HashMap<Character, Integer> letterCount, int[] score, int index) {
        if (words.length == index) {
            return 0;
        }

        int skipScore = backtrack(words, letterCount, score, index + 1);

        String word = words[index];
        int wordScore = 0;
        boolean canUseWord = true;
        HashMap<Character, Integer> tempLetterCount = new HashMap<>(letterCount);

        for (char letter : word.toCharArray()) {
            if (tempLetterCount.getOrDefault(letter, 0) == 0) {
                canUseWord = false;
                break;
            }
            tempLetterCount.put(letter, tempLetterCount.get(letter) - 1);
            wordScore += score[letter - 'a'];
        }

        int useScore = 0;
        if (canUseWord) {
            useScore = wordScore + backtrack(words, tempLetterCount, score, index + 1);
        }

        return Math.max(skipScore, useScore);
    }

    public static void main(String[] args) {
        int[] score = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] words = {"dog", "cat", "dad", "good"};
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};

        MaximumScoreWordsFormedByLetters maxScoreWordsFormedByLetters = new MaximumScoreWordsFormedByLetters();
        maxScoreWordsFormedByLetters.maxScoreWords(words, letters, score);
    }
}
