public class NhanVien {
    private Integer manv;
    private String hoten;
    private String quequan;
    private Float heSoLuong;

    public NhanVien(){}

    public NhanVien(Integer manv, String hoten, String quequan, Float heSoLuong) {
        this.manv = manv;
        this.hoten = hoten;
        this.quequan = quequan;
        this.heSoLuong = heSoLuong;
    }

    public Integer getManv() {
        return manv;
    }

    public void setManv(Integer manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void inThongTin() {
        System.out.println("Manv: " + getManv());
        System.out.println("Ho ten: " + getHoten());
        System.out.println("Que quan: " + getQuequan());
        System.out.println("He so luong: " + getHeSoLuong());
        System.out.println("------------------------------");
    }
}
