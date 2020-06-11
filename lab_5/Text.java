package lab_5;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        String textString = "";
        for (int i = 0; i < sentences.length; i++) {
            if (i != sentences.length - 1) {
                textString = textString + sentences[i].toString() + " ";
            }
            else {
                textString = textString + sentences[i].toString() + "";
            }
        }
        return textString;
    }
}
