import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyThiSinh ql = new QuanLyThiSinh();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat khoi chuong trinh");
            System.out.print("Chon: ");
            try {
                chon = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                chon = 0;
            }

            switch (chon) {
                case 1: ql.themMoi(); break;
                case 2: ql.hienThiTatCa(); break;
                case 3: ql.timTheoSbd(); break;
                case 4: System.out.println("Tam biet!"); break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 4);
    }
}