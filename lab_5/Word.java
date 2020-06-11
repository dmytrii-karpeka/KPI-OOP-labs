package lab_5;

public class Word {
    private Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        String wordString = "";
        for (Letter letter : letters) {
            wordString = wordString + letter.toString();
        }
        return wordString;
    }
}
