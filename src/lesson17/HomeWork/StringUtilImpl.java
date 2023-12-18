package lesson17.HomeWork;

public class StringUtilImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null || number2 == null) {
            throw new NullPointerException(" number1==null||number2==null ");
        }

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        if (num2 == 0) {
            throw new ArithmeticException(" num2==0 ");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {



            if (word != "word") {
                throw new NullPointerException("В этом тексте нет слов word");
            }

            if (word == "word") {


            }

        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
