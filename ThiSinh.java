public abstract class ThiSinh {
    private String sbd;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh(String sbd, String hoTen, String diaChi, int mucUuTien) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSbd() { return sbd; }

    public abstract String getKhoiThi();
    public abstract String getMonThi();

    public void hienThi() {
        System.out.println("SBD: " + sbd);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Muc uu tien: " + mucUuTien);
        System.out.println("Khoi thi: " + getKhoiThi());
        System.out.println("Cac mon thi: " + getMonThi());
        System.out.println("-----------------------");
    }
}