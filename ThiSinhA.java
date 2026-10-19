public class ThiSinhA extends ThiSinh {
    public ThiSinhA(String sbd, String hoTen, String diaChi, int mucUuTien) {
        super(sbd, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoiThi() { return "A"; }
    @Override
    public String getMonThi() { return "Toan, Ly, Hoa"; }
}