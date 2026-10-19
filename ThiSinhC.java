public class ThiSinhC extends ThiSinh {
    public ThiSinhC(String sbd, String hoTen, String diaChi, int mucUuTien) {
        super(sbd, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoiThi() { return "C"; }
    @Override
    public String getMonThi() { return "Van, Su, Dia"; }
}