package TKNH;
public class LoiChuyenTien extends Exception{
    public LoiChuyenTien(String message){
        super(message);
    }
    public void RutTien (int rut, int taiKhoan) throws LoiChuyenTien{
        if(rut > taiKhoan){
            throw new LoiChuyenTien("Tien rut nhieu hon tien trong tai khoan");
        }
    }
}
