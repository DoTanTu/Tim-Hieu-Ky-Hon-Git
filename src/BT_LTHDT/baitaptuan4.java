
package BT_LTHDT;
import java.util.Scanner;
public class baitaptuan4 {
    public static void nhap_xuat(int[] A , int n) {
        Scanner sc = new Scanner(System.in);
        {
            for (int i = 1; i <= n ; i++) {
                System.out.print("+ Phan tu thu [" + i +"]: ");
                A[i] = sc.nextInt();
            }
            System.out.println("\n==>> Day so da nhap la : ");
            for (int i = 1; i <= n ; i++) {
                System.out.print(A[i] + "   |   ");
            }
            System.out.println("\n");
        }
    }
    public static void inSochan(int[] A , int n ) {
        System.out.println("-->> Cac so chan trong day la  : ");
        for (int i = 1; i <= n ; i++) {
            if (A[i] % 2 == 0) {
                System.out.print("   " + A[i]);
            }
        }
        System.out.println("\n");
    }
    public static void inSoLe(int[] A , int n ) {
        System.out.println("-->> Cac so le trong day la : ");
        for (int i = 1; i <= n ; i++) {
            if (A[i] % 2 != 0) {
                System.out.print("   " + A[i]);
            }
        }
        System.out.println("\n");
    }   
public static void doc(int n){
  int a = n % 10;
  int b = (n / 10) % 10;
  int c = n / 100;
  //điều kiện số có hai chữ số
  if(n<100 || n > 999){
    System.out.printf("So ban nhap vao khong dung ");
  }
  else{
      //in ra hang tram
    switch(c){
      case 1: System.out.printf("-->> Một trăm ");break;
      case 2: System.out.printf("-->> Hai trăm ");break;
      case 3: System.out.printf("-->> Ba trăm ");break;
      case 4: System.out.printf("-->> Bốn trăm ");break;
      case 5: System.out.printf("-->> Năm trăm ");break;
      case 6: System.out.printf("-->> Sáu trăm ");break;
      case 7: System.out.printf("-->> Bảy trăm ");break;
      case 8: System.out.printf("-->> Tám trăm ");break;
      case 9: System.out.printf("-->> Chín trăm ");break;
    }
    if(b % 10 == 0 && a != 0){
      System.out.printf("lẻ ");
    }
    //in ra hàng chục
    switch(b){
      case 1: System.out.printf("mười ");break;
      case 2: System.out.printf("hai mươi ");break;
      case 3: System.out.printf("ba mươi ");break;
      case 4: System.out.printf("bốn mươi ");break;
      case 5: System.out.printf("năm mươi ");break;
      case 6: System.out.printf("sáu mươi ");break;
      case 7: System.out.printf("bảy mươi ");break;
      case 8: System.out.printf("tám mươi ");break;
      case 9: System.out.printf("chín mươi ");break;
    }
    //in ra hàn đơn vị
    switch(a){
      case 1: System.out.printf("một ");break;
      case 2: System.out.printf("hai ");break;
      case 3: System.out.printf("ba ");break;
      case 4: System.out.printf("bốn ");break;
      case 5: System.out.printf("năm ");break;
      case 6: System.out.printf("sáu ");break;
      case 7: System.out.printf("bảy ");break;
      case 8: System.out.printf("tám ");break;
      case 9: System.out.printf("chín ");break;
    }
  }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n --Nhap vao so co 3 chu so ma ban muon doc: ");
        int n = sc.nextInt();
        System.out.printf("\n");
        doc(n);
        System.out.printf("\n");	
        System.out.println();
        int h ;
        System.out.print("Nhap vao mang cac phan tu de in ra cac so chan, le.\n");
        System.out.print("Nhap vao bao nhieu phan tu : ");
        h = sc.nextInt();
        int[] A = new int[h + 1];   
        nhap_xuat(A , h );
        inSochan(A , h );
        inSoLe(A , h );
        System.out.print("\n\nThank you for watching \n");
    }
}
