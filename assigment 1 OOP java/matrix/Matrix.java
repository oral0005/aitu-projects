public class Matrix {
    int row,colum,multip;



    public int print(int row, int colum) {
        int a = 0;
        int h = 0;
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = h + 1; j <= colum+h; j++) {
                System.out.print(j + " ");

                a = j;
            }
            h = a;


        }

        return 0;
    }
    public int printm(int row,int colum,int multip) {
        int a = 0;
        int h = 0;
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = h + 1; j <= colum+h; j++) {
                System.out.print(j*multip + " ");

                a = j;
            }
            h = a;


        }

        return 0;
    }
}
