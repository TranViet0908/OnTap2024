import java.util.Scanner;

public class LoiDuLieu {
    public static void Divided (double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        } else System.out.println("Ket qua: " + a/b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap a: ");
            double a = sc.nextDouble();
            System.out.println("Nhap b: ");
            double b = sc.nextDouble();
            Divided(a, b);
        } catch (ArithmeticException e){
            System.out.println("Loi chia: " + e.getMessage());
        }
        sc.close();
    }
}