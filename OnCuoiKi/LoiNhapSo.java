import java.util.Scanner;

public class LoiNhapSo {
    public static int getNumber(String n) throws NumberFormatException, IllegalArgumentException{
        if(n.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap so n: ");
            int n = getNumber(sc.nextLine());
            System.out.println("So vua nhap: " + n);
        } catch (NumberFormatException e){
            System.out.println("Loi nhap so: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Loi ko nhap gia tri: " + e.getMessage());
        }
        sc.close();
    }
}
