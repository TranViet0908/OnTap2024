import java.util.Scanner;

public class LoiGanGtri extends Exception{
    public LoiGanGtri(String message){
        super(message);
    }
    public static void CheckChen(int i) throws LoiGanGtri{
        if(i == 9){
            throw new LoiGanGtri("Loi gan gia tri");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[8];
        for(int i = 0; i < a.length; i++){
            System.out.println("Nhap gia tri cho " + (i+1));
            a[i] = sc.nextInt();
        } 
        try {
            System.out.println("Nhap phan tu can in ra: ");
            int p = sc.nextInt();
            CheckChen(p);
        } catch (LoiGanGtri e) {
            System.out.println("Loi: " + e.getMessage());
        }
        sc.close();
    }
}
