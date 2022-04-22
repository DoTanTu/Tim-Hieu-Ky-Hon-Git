
package baitap;

import java.util.Random;
public class output {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
         System.out.println("test r" + r);
for( int i = 0; i < 1300; i++){
try{
b = r.nextInt();
c = r.nextInt();
a = 12345/ (b/c);
System.out.println("a");
}catch ( ArithmeticException e){
System.out.println("division by zero");
a = 0;
}
System.out.println("a" + a);
}
}

}