import java.util.Scanner;

public class lab3 {
    /**
     * C3 = 2 - String
     * C17 = 15 - replace words specified length with specified word
     *
     */
    public static void main(String[] args) {
        String text = new String("Я на гору круту крем’яную\n" +
                "Буду камінь важкий підіймать\n" +
                "І, несучи вагу ту страшную,\n" +
                "Буду пісню веселу співать.\n" +
                "Shakespeare's early plays were written in the conventional style of the day, with elaborate" +
                " metaphors and rhetorical phrases that didn't always " +
                "align naturally with the story's plot or characters.\n" +
                "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо - песнь заводит,\n" +
                "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");

        String str = sc.next();
        System.out.println("Enter length:");
        String len = sc.next();
        try
        {
            int i = Integer.parseInt(len.trim());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Incorrect value:" + nfe.getMessage());
            System.exit(1);
        }
        String replecedText = text.replaceAll("\\b([Є-ЯҐа-їґ’']|[а-яА-ЯЁё]|[a-zA-Z']){" + len + "}\\b", str);
        System.out.println(replecedText);
    }
}
