
package BT_LTHDT;
import java.util.Scanner;
public class Baitaptuan5 {
    public static void Nhap_mang(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        for( int i = 1; i <= n; i++){
            System.out.print("Nhap vao phan tu thu [" + i + "] : ");
            arr[i] = sc.nextInt();
               }
    }
    public static void Xuat_Mang(int[] arr, int n){
        for( int i = 1; i <= n; i++){
            System.out.print(arr[i] + "  |  ");
        }
        System.out.println("\n");
    }
    public static void So_Chan(int[] arr, int n){
        System.out.println("So chan co trong day la: ");
        for( int i = 1; i <= n; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + "  |  ");
            }
        }
        System.out.println("\n");
    }
    public static void So_Le(int[] arr, int n){
        System.out.println("So le co trong day la : ");
        for( int i = 1; i <= n; i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i] + "  |  ");
            }
        }
        System.out.println("\n");
    }
    public static void duavao(){
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.print("Nhap vao chuoi can chuan hoa: ");
        str = sc.nextLine();
        System.out.print("\n-->> Chuoi truoc khi chuan hoa la: "+ str);
        chuanhoa(str);
    }
    public static void chuanhoa(String s){
        s = s.toLowerCase();
        String[] ss;
        String s2 = "";
        ss = s.split(" ");
        for(int i = 0; i<ss.length; i++){
            String s1 = "";
            if(ss[i].length() !=0){
               s1 += Character.toUpperCase(ss[i].charAt(0));
               if(ss[i].length() > 1) s1+= ss[i].substring(1);
               s2 += s1;
               if(i < ss.length) s2 += " ";
            }       
        }
        if(s2.charAt(s2.length()-1) == ' ')s2 += "\b";
        for(char c = '0' ; c < '9'; c++){
	     s2 = s2.replace(c + "", "");
	}
        System.out.print("\n-->> Chuoi sau khi chuan hoa la: "+ s2);
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao bao nhieu phan tu: ");
        n = sc.nextInt();
        int[] arr = new int[n + 1];
        Nhap_mang( arr,n);
        System.out.println("\nDay so da nhap vao la: ");
        Xuat_Mang(arr,n);
        So_Chan( arr,  n);
        So_Le( arr,  n);
        duavao();
        
        
    }
}
