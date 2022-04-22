
import java.util.Scanner;
public class baitaptuan4_2 {
    public static void nhap(int[] A , int n) {
        Scanner sc = new Scanner(System.in);
        {   
            
            for (int i = 1; i <= n ; i++) {
                System.out.print("Nhap vao phan tu thu [" + i + "] :"  );
                A[i] = sc.nextInt();
            }
            System.out.println("\nDay so da nhap vao la : ");
            for (int i = 1; i <= n ; i++) {
                System.out.print(A[i] + "      ");

            }
            System.out.println("\n");
        }
    }
    public static void inSochan(int[] A , int n ) {
        System.out.println("Cac so chan co trong day la : ");
        for (int i = 1; i <= n ; i++) {
            if (A[i] % 2 == 0) {
                System.out.print(" " + A[i]);
            }
        }
        System.out.println("\n");
    }
    public static void inSoLe(int[] A , int n ) {
        System.out.println(" Cac so le co trong day la : ");
        for (int i = 1; i <= n ; i++) {
            if (A[i] % 2 != 0) {
                System.out.print(" " + A[i]);
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n ;
        System.out.print("Nhap vao bao nhieu phan tu : ");
        n = sc.nextInt();
        int[] A = new int[n + 1];
        nhap(A , n );
        inSochan(A , n );
        inSoLe(A , n );
    }
    }
