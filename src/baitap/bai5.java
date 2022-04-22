
package baitap;

public class bai5 {
    static void demoproc(){
        try{
            throw new NullPointerException("tuy y");
        }catch(NullPointerException e){
            System.out.println("Caught in side demoproc");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Recaught" + e);
        }
    }
}
