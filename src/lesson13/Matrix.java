package lesson13;

public class Matrix implements IMatrix {

    private double[][] nums;

    public Matrix() {
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {

        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит");
            return -1;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит");
            return -1;
        }


        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит");
            return;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит");
            return;
        }

        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //  а --- this)
        //  b --- otherMatrix)
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < this.getRows(); i++) { // aRow
            for (int j = 0; j < otherMatrix.getColumns(); j++) { // bColumn
                for (int k = 0; k < this.getColumns(); k++) { // aColumn
                    result.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(i, j));
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(j,i,this.getValueAt(i,j));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
               this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        // this - та матрица которую мы хотим напечатать

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getRows(); j++) {
                System.out.println(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }

    }
}
