package lab_5;

import java.util.Arrays;
import java.util.Objects;

public class Sentence {
    private Object[] sentenceParts;

    public Sentence(Object[] sentenceParts) {
        this.sentenceParts = sentenceParts;
    }

    @Override
    public String toString() {
        String sentenceString = "";

        for (int i = 0; i < sentenceParts.length; i++) {
            if (i != 0 && sentenceParts[i] instanceof Word) {
                sentenceString = sentenceString + " " + sentenceParts[i].toString();
            }
            else {
                sentenceString = sentenceString + "" + sentenceParts[i].toString();
            }
        }
        return sentenceString;
    }
}
