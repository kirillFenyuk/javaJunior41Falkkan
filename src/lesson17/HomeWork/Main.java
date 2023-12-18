package lesson17.HomeWork;

public class Main {
    public static void main(String[] args) {
        StringUtilImpl util = new StringUtilImpl();

        String number1 = "20";
        String number2 = "5";

        String text = "Пы таемся найти word в этом тексте.";
        String word = "word";

        System.out.println(util.div(number1,number2));

        System.out.println(util.findWord(text,word));

    }
}
