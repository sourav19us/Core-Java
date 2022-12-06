public class Matrix {
    private int arr[][];

    public Matrix() {
        arr = new int[3][3];
    }

    public Matrix(int a, int b) {
        arr = new int[a][b];
    }

    public int arrRlength() {
        return arr.length;
    }

    public int arrClength() {
        return arr[0].length;
    }

    public Matrix(Matrix ref) {
        arr = new int[ref.arrRlength()][ref.arrClength()];
    }

    public void get() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
