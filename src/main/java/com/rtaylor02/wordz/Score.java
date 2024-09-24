package com.rtaylor02.wordz;

/**
 * @author Rodney Taylor (u228616)
 */
public class Score {
    private final String correct;
    private Letter result = Letter.INCORRECT;
    private int position;

    public Score(String correct) {
        this.correct = correct;
    }

    public Letter letter(int position) {
        return result;
    }

    public void assess(int position, String attempt) {
        if (isCorrectLetter(attempt)) {
            result = Letter.CORRECT;
        }
    }

    private boolean isCorrectLetter(String attempt) {
        return correct.charAt(position) == attempt.charAt(position);
    }
}
