
package baitap;


public class class2 {
        public static void main(String[] args) {
        try{
           int a = 0;
           int b = 42 /a;
            System.out.println("a = " + a);
            try{
                if(a==1)
                    a = a / (a - a);
                if( a == 2){
                     int c [] = {1};
                     c[42]= 99;
                }  
            }
            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch 2 " + e); 
        }
        }
        catch(ArithmeticException e){
            System.out.println(" Divide by 0 / catch 1 ");
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Chi so cua mang phai < 3: ");
        }
        }
}
