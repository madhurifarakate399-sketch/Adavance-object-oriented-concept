import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose of First Matrix");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                    }
                }
                System.out.println("Matrix Addition Result:");
                printMatrix(C);
                break;

            case 2:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
                System.out.println("Matrix Multiplication Result:");
                printMatrix(C);
                break;

            case 3:
                System.out.println("Transpose of First Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(A[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    static void printMatrix(int[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
