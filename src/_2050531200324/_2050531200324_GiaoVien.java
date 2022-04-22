
package _2050531200324;

public class _2050531200324_GiaoVien extends _2050531200324_Nguoi{
    private String monDay;
    private double tienLuongCoBan;
    private double heSoLuong;
    private boolean bienChe;

    public _2050531200324_GiaoVien() {
    }

    public _2050531200324_GiaoVien(String monDay, double tienLuongCoBan, double heSoLuong, boolean bienChe, String ten, int tuoi) {
        super(ten, tuoi);
        this.monDay = monDay;
        this.tienLuongCoBan = tienLuongCoBan;
        this.heSoLuong = heSoLuong;
        this.bienChe = bienChe;
    }

    @Override
    public String toString() {
        return "_2050531200324_GiaoVien{" + "monDay=" + monDay + ", tienLuongCoBan=" + tienLuongCoBan + ", heSoLuong=" + heSoLuong + ", bienChe=" + bienChe + '}';
    }

    public String getMonDay() {
        return monDay;  
    }
    public double TinhTienLuong(){
        if(bienChe ){
            return tienLuongCoBan*heSoLuong;
        }
        else
            return tienLuongCoBan;
    }
    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public double getTienLuong() {
        return tienLuongCoBan;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuongCoBan = tienLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean isBienChe() {
        return bienChe;
    }

    public void setBienChe(boolean bienChe) {
        this.bienChe = bienChe;
    }
    
}
