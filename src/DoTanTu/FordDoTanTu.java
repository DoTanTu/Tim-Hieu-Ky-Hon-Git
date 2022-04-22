
package DoTanTu;
   /*Create a subclass of CarYourName class and name it as FordYourName. The FordYourName class has
   the following fields and methods*/
    public class FordDoTanTu extends CarDoTanTu {
     int year;
     int manufacturerDiscount;
    public FordDoTanTu(int year, int manufacturerDiscount, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getRegularPrice() - manufacturerDiscount;
    }
}


