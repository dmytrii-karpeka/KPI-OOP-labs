package lab_5;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Letter[] letters1 = {
                new Letter('a'),
                new Letter('r'),
                new Letter('e')
        };

        Letter[] letters2 = {
                new Letter('y'),
                new Letter('o'),
                new Letter('u')
        };

        Letter[] letters3 = {
                new Letter('m'),
                new Letter('y')

        };

        Letter[] letters4 = {
                new Letter('f'),
                new Letter('r'),
                new Letter('i'),
                new Letter('e'),
                new Letter('n'),
                new Letter('d'),
        };

        Letter[] letters5 = {
                new Letter('n'),
                new Letter('o'),
                new Letter('t')
        };

        Letter[] letters6 = {
                new Letter('f'),
                new Letter('u'),
                new Letter('n'),
                new Letter('n'),
                new Letter('y'),
        };

        Letter[] letters7 = {
                new Letter('i'),
                new Letter('s'),
        };

        Letter[] letters8 = {
                new Letter('i'),
                new Letter('t'),
        };

        Word word1 = new Word(letters1);

        Word word2 = new Word(letters2);

        Word word3 = new Word(letters3);

        Word word4 = new Word(letters4);

        Word word5 = new Word(letters5);

        Word word6 = new Word(letters6);

        Word word7 = new Word(letters7);

        Word word8 = new Word(letters8);

        Punctuation punctuation1 = new Punctuation("?");

        Punctuation punctuation3 = new Punctuation("?!");

        Punctuation punctuation4 = new Punctuation(",");

        Sentence sentence1 = new Sentence(new Object[]{
                word1,
                word2,
                word3,
                word4,
                punctuation1
        });

        Sentence sentence2 = new Sentence(new Object[]{
                word5,
                word6,
                punctuation4,
                word7,
                word8,
                punctuation3
        });

        Text text = new Text(new Sentence[]{sentence1, sentence2});
        System.out.println(text);

        System.out.println("Enter word:");

        String str = sc.next();
        System.out.println("Enter length:");
        String len = sc.next();
        try
        {
            Integer.parseInt(len.trim());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Incorrect value:" + nfe.getMessage());
            System.exit(1);
        }

        String replacedText = text.toString()
                .replaceAll("\\b([Є-ЯҐа-їґ]|[а-яА-ЯЁё]|[a-zA-Z]|[’]){" + len + "}\\b", str);

        System.out.println(replacedText);
    }
}
