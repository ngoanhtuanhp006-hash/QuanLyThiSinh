import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThiSinh {
    private ArrayList<ThiSinh> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    private ThiSinh timThiSinh(String sbd) {
        for (ThiSinh ts : danhSach) {
            if (ts.getSbd().equals(sbd)) {
                return ts;
            }
        }
        return null;
    }

    public void themMoi() {
        String sbd;
        while (true) {
            System.out.print("Nhap SBD: ");
            sbd = sc.nextLine().trim();
            if (sbd.isEmpty()) {
                System.out.println("SBD khong duoc de trong!");
            } else if (timThiSinh(sbd) != null) {
                System.out.println("SBD da ton tai, nhap SBD khac!");
            } else {
                break;
            }
        }

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();

        int uuTien;
        while (true) {
            System.out.print("Nhap muc uu tien (so): ");
            try {
                uuTien = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Muc uu tien phai la so!");
            }
        }

        String khoi;
        while (true) {
            System.out.print("Nhap khoi thi (A/B/C): ");
            khoi = sc.nextLine().trim().toUpperCase();
            if (khoi.equals("A") || khoi.equals("B") || khoi.equals("C")) {
                break;
            }
            System.out.println("Khoi thi khong hop le, chi nhap A, B hoac C!");
        }

        ThiSinh ts;
        if (khoi.equals("A")) ts = new ThiSinhA(sbd, hoTen, diaChi, uuTien);
        else if (khoi.equals("B")) ts = new ThiSinhB(sbd, hoTen, diaChi, uuTien);
        else ts = new ThiSinhC(sbd, hoTen, diaChi, uuTien);

        danhSach.add(ts);
        System.out.println("Them thanh cong!");
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (ThiSinh ts : danhSach) {
            ts.hienThi();
        }
    }

    public void timTheoSbd() {
        System.out.print("Nhap SBD can tim: ");
        String sbd = sc.nextLine().trim();
        ThiSinh ts = timThiSinh(sbd);
        if (ts != null) {
            ts.hienThi();
        } else {
            System.out.println("Khong tim thay thi sinh!");
        }
    }
}