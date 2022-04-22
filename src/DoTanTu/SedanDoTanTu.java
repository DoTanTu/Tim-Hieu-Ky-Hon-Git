
package DoTanTu;
/*Create a subclass of CarYourName class and name it as SedanYourName. The SedanYourName class
has the following fields and methods. */
public class SedanDoTanTu extends CarDoTanTu {
    int length;
    public SedanDoTanTu(int length, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getRegularPrice()*0.95;
        }
        return super.getRegularPrice()*0.9;

    }

}
