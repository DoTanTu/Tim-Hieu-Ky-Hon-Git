
package DoTanTu;

public class CarDoTanTu {
    private int speed;
    private double regularPrice;
    private String color;

    public CarDoTanTu(int Speed, double regularPrice, String color) {
        this.speed = Speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice(){
        return regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    

}
