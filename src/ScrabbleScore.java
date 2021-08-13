public class ScrabbleScore {
    final static String[] ALL_LETTERS = {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
    final static int[] ALL_POINTS = {1, 2, 3, 4, 5, 8, 10};

    public int getScrabbleScore (String word) {
        int wordScore = 0;
            for (int i = 0; i < ALL_LETTERS.length; i++) {
                for (char singleWordLetter : word.toUpperCase().toCharArray()) {
                    if (ALL_LETTERS[i].indexOf(singleWordLetter) != -1) {
                        wordScore+= ALL_POINTS[i];
                    }
                }
            }
        return wordScore;
    }
}
