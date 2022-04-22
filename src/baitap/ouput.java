
package baitap;
    class ouput {
    public static void main(String args[]) {
    int d, a;
    try{
       d = 0;
       a = 42/d;
         System.out.println("Resualt = +" + a);
         System.out.println("This will test");
     }
    catch(ArithmeticException e){
         System.out.println("Ma khong the thuc hien");
    }
         System.out.println("After catch statetame 1");
         System.out.println("After catch statetame 2");
     }

    }

