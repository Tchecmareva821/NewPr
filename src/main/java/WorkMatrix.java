import Jama.Matrix;

import java.util.Scanner;

public class WorkMatrix implements SomeClass.CallBack {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void Test(int n) {
        test(fRet(xRet(n)),yRet(n));
    }

    private double[][] fRet(double[][] x) {
        double[][] f = new double[x.length][3];
        for (int i = 0; i < f.length; i++) {
            f[i][0] = 1;
        }
        for (int i = 0; i < f.length; i++) {
            for (int j = 1; j < f[i].length; j++) {
                if (j == 1) {
                    f[i][j] = Math.log(x[i][j - 1] * x[i][j - 1]);
                    continue;
                }
                if (j == 2) {
                    f[i][j] = Math.log(x[i][j - 1]);
                    continue;
                }
            }
        }
        return f;
    }

    private double[][] xRet(int n) {
        double[][] x = new double[n][2];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter x[" + i + "]: ");
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = scanner.nextDouble();
            }
        }
        return x;
    }

    private double[] yRet(int n) {
        double[] y = new double[n];
        System.out.println("Enter y: ");
        for (int i = 0; i < y.length; i++) {
            y[0] = scanner.nextDouble();
        }
        return y;
    }

    private void test(double[][] x, double[] yy) {
        Matrix A1 = new Matrix(x);
        A1.print(10, 2);
        Matrix B1 = A1.transpose();
        Matrix F1 = A1.times(B1);
        Matrix F4 = F1.inverse();
        Matrix F2 = F4.times(A1);
        Matrix C = new Matrix(yy, yy.length);
        Matrix F3 = F2.times(C);
        double[] z = F3.getColumnPackedCopy();
        for (int i = 0; i < 3; i++)
            System.out.println("z[" + i + "]=" + z[i]);
    }
}