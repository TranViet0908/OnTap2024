package QLSanPham;

import java.util.Scanner;

public class SanPham{
    private String MSP;
    private String TenSP;
    private String NSX;
    private String HSD;
    private int SoLo;
    private String ToSanXuat;
    public static Scanner sc = new Scanner(System.in);
    public SanPham(String mSP, String tenSP, String nSX, String hSD, int soLo, String toSanXuat) {
        MSP = mSP;
        TenSP = tenSP;
        NSX = nSX;
        HSD = hSD;
        SoLo = soLo;
        ToSanXuat = toSanXuat;
    }
    public void inPut(){
        System.out.println("Nhap Ma san pham: ");
        this.MSP = sc.nextLine();
        System.out.println("Nhap Ten san pham: ");
        this.TenSP = sc.nextLine();
        System.out.println("Nhap NSX: ");
        this.NSX = sc.nextLine();
        System.out.println("Nhap HSD: ");
        this.HSD = sc.nextLine();
        System.out.println("Nhap So lo: ");
        this.SoLo = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap To san xuat: ");
        this.ToSanXuat = sc.nextLine();
    }
    public void outPut(){
        System.out.println("Ma san pham: " + this.MSP);
        System.out.println("Ten san pham: " + this.TenSP);
        System.out.println("NSX: " + this.NSX);
        System.out.println("HSD: " + this.HSD);
        System.out.println("So lo: " + this.SoLo);
        System.out.println("To san xuat: " + this.ToSanXuat);
    }
    public String getMSP() {
        return MSP;
    }
    public void setMSP(String mSP) {
        MSP = mSP;
    }
    public String getTenSP() {
        return TenSP;
    }
    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }
    public String getNSX() {
        return NSX;
    }
    public void setNSX(String nSX) {
        NSX = nSX;
    }
    public String getHSD() {
        return HSD;
    }
    public void setHSD(String hSD) {
        HSD = hSD;
    }
    public int getSoLo() {
        return SoLo;
    }
    public void setSoLo(int soLo) {
        SoLo = soLo;
    }
    public String getToSanXuat() {
        return ToSanXuat;
    }
    public void setToSanXuat(String toSanXuat) {
        ToSanXuat = toSanXuat;
    }
}