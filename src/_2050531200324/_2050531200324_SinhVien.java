
package _2050531200324;

public class _2050531200324_SinhVien extends _2050531200324_Nguoi{
   private int sinhVienNamThu ;
   private String truong;

    public _2050531200324_SinhVien() {
    }


    public _2050531200324_SinhVien(int sinhVienNamThu, String truong, String ten, int tuoi) {
        super(ten, tuoi);
        this.sinhVienNamThu = sinhVienNamThu;
        this.truong = truong;
    }
  
    public void ThongTin(){
        System.out.println("Hien thi ten : " + this.getTen());
        System.out.println("Hien thi tuoi : " + this.getTuoi());
        System.out.println("Hien thi nam : " + this.getSinhVienNamThu());
        System.out.println("Hien thi truong : " + this.getTruong());
        
    } 
    public int getSinhVienNamThu() {
        return sinhVienNamThu;
    }

    public void setSinhVienNamThu(int sinhVienNamThu) {
        this.sinhVienNamThu = sinhVienNamThu;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

}
