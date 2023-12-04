package lesson13;

public class Main {
    public static void main(String[] args) {

        double[][] numsForA = {{2, 3, 4, 6},
                              {7, 3, 9, 3},
                              {7, 3, 5, 6}};

        Matrix a = new Matrix(numsForA);

        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(0,0));

        a.setValueAt(0,0,9);
        System.out.println(a.getValueAt(0,0));

        double[][] numsForB = {{5, 5, 5, 5},
                               {5, 5, 5, 5},
                               {5, 5, 5, 5}};

        Matrix b = new Matrix(numsForB);

        // неявный параметр - а (внутри метода доступно по this)
        // явный параметр - b (внутри метода доступен otherMatrix)
        IMatrix resultAdd=a.add(b);
        IMatrix resultSub=a.sub(b);
        IMatrix resultMul=a.mul(b);
        IMatrix reseltMulNaChiclo=a.mul(10.0);
        // IMatrix resultTranspose=a.transpose();


        System.out.println("-- Сумма матриц --");
        resultAdd.printToConsole();
        System.out.println("-- Печать текущей матрици --");
        a.printToConsole();
        System.out.println("-- Разность матриц --");
        resultSub.printToConsole();
        System.out.println("-- Произведение матриц --");
        resultMul.printToConsole();
        System.out.println("-- Произведение на число");
        reseltMulNaChiclo.printToConsole();
        System.out.println("-- Транспонирование матрицы --");
        //resultTranspose.printToConsole();
        System.out.println("-- Заполнение матрицы одним числом --");
        a.fillMatrix(8.0);
        a.printToConsole();






    }
}
