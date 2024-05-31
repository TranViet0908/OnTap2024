import java.util.Scanner;

public class first12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try{
                System.out.println("Nhap chuong trinh tu bai 1 den 12:");
                System.out.println("1: Tong so nguyen to tu 1 toi n");
                System.out.println("2: Liet ke n so nguyen to dau tien");
                System.out.println("3: Liet ke tat ca cac so nguyen to nho hon n");
                System.out.println("4: Tong cac chu so");
                System.out.println("5: Tinh tien taxi");
                System.out.println("6: Tinh tong: ");
                System.out.println("7: Tong 10 so chan dau tien");
                System.out.println("8: In so le tu 1 -> 99");
                System.out.println("9: Tong cac boi so cua 7 (tu 1 -> 100)");
                System.out.println("10: Tong cac so chan/le tu 1 den n (theo n chan/le)");
                System.out.println("11: So lan ki tu 'a' xuat hien");
                System.out.println("12: Dem so luong so trong chuoi");
                System.out.println("0: Thoat chuong trinh!");
                System.out.println("Nhap chuc nang ban chon: ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Loi: " + e.getMessage());
            }
        }
    }
}