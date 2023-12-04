package lesson3;

public class Main2 {
    public static void main(String[] args) {

        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};

        char[] absdqwer = new char[abcd.length + qwer.length];

        for (int i = 0; i < absdqwer.length; i++) {

            if (i<abcd.length) { // Сохранение из 1го массива

                absdqwer[i]=abcd[i];

            } else { // Сохранение из 2го массива

                absdqwer[i]=qwer[i-abcd.length];

            }
            System.out.println(absdqwer[i]);
        }

        //absdqwer[0] = abcd[0];
        //absdqwer[1] = abcd[1];
        //absdqwer[2] = abcd[2];
        //absdqwer[3] = abcd[3];

        //absdqwer[4] = qwer[0];
        //absdqwer[5] = qwer[1];
        //absdqwer[6] = qwer[2];
        //absdqwer[7] = qwer[3];
    }
}
