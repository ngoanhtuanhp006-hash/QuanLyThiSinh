public class ThiSinhB extends ThiSinh {
    public ThiSinhB(String sbd, String hoTen, String diaChi, int mucUuTien) {
        super(sbd, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoiThi() { return "B"; }
    @Override
    public String getMonThi() { return "Toan, Hoa, Sinh"; }
}