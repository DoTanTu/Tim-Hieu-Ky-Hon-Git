
package DoTanTu;
public class MyOwnAutoShop {
    public static void main(String[] args) {
    SedanDoTanTu Sedan = new SedanDoTanTu(160,20000 , 10, "Red");
    FordDoTanTu Ford1 = new FordDoTanTu(2005, 10, 156, 4452.0, "Black");
    FordDoTanTu Ford2 = new FordDoTanTu(2005, 5, 155, 5000.0, "Pink");
    CarDoTanTu Car = new CarDoTanTu(555, 56856.0, "Red");
    System.out.println("Result MySedan Price  : " +  Sedan.getSalePrice());
    System.out.println("Result MyFord1 Price  : " +  Ford1.getSalePrice());
    System.out.println("Result MyFord2 Price  : " +  Ford2.getSalePrice());
    System.out.println("Result MyCar Price    : " +  Car.getSalePrice()
        );
    }
}
