import java.sql.SQLOutput;
import java.util.*;

public class DSNhanVien {
    private ArrayList<NhanVien> dsnv = new ArrayList<>();
    private Integer soLuongNhanVien = 0;

    public Integer getSoLuongNhanVien(){
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(Integer soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public void nhapThongTinNhanVien(){
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            NhanVien nhanVien = new NhanVien();
            System.out.println("Nhap thong tin nhan vien " + getSoLuongNhanVien() + 1);
            nhanVien.setManv(getSoLuongNhanVien() + 1);
            System.out.print("Ho ten: ");
            nhanVien.setHoten(sc.nextLine());
            System.out.print("Que quan: ");
            nhanVien.setQuequan(sc.nextLine());
            System.out.print("He so luong: ");
            nhanVien.setHeSoLuong(sc.nextFloat());

            setSoLuongNhanVien(getSoLuongNhanVien() + 1);
            dsnv.add(nhanVien);
            System.out.println("Ban co muon tiep tuc nhap thong tin khong? (Nhap 'k' de thoat)");
            c = sc.next().charAt(0);
            sc.nextLine();

        } while(c != 'k');
    }

    public void hienThiThongTin() {
        for(NhanVien nhanVien:this.dsnv){
            nhanVien.inThongTin();
        }
    }
}
