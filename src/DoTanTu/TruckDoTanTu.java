
package DoTanTu;
/*Create a subclass of CarYourName class and name it as TruckYourName. The TruckYourName class has the following fields and methods. */

public class TruckDoTanTu extends CarDoTanTu {
    int weight;
    public TruckDoTanTu(int Speed, double regularPrice, String color, int weight  ) {
        super(Speed, regularPrice, color);
        this.weight = weight;
    }
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getRegularPrice()*0.9;
        }
        return super.getRegularPrice()*0.8;
    }
}


