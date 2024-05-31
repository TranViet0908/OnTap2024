package QLSanPham;

public class SanPhamCC extends SanPham {
    private String loaiSP;
    private double phuPhi;
    public SanPhamCC(String mSP, String tenSP, String nSX, String hSD, int soLo, String toSanXuat, String loaiSP,
            double phuPhi) {
        super(mSP, tenSP, nSX, hSD, soLo, toSanXuat);
        this.loaiSP = loaiSP;
        this.phuPhi = phuPhi;
    }
    @Override
    public void inPut(){
        super.inPut();
        System.out.println("Nhap loai san pham: ");
        this.loaiSP = sc.nextLine();
        System.out.println("Nhap phu phi: ");
        this.phuPhi = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void outPut(){
        super.outPut();
        System.out.println("Loai san pham: " + this.loaiSP);
        System.out.println("Phu phi: " + this.phuPhi);
    }
    public String getLoaiSP() {
        return loaiSP;
    }
    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
    public double getPhuPhi() {
        return phuPhi;
    }
    public void setPhuPhi(double phuPhi) {
        this.phuPhi = phuPhi;
    }
}
