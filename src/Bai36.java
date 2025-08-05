import java.util.Scanner;

public class Bai36 {
    public static void kiemTraSoNguyenDuongc1(){
        int n=0;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("(do-while) Xin moi nhap 1 so nguyen duong");
            n=sc.nextInt();
        }while (n<=0);
        System.out.println("Đã nhập thành công");
    }
    public static void kiemTraSoNguyenDuongc2(){
        int n=0;
        while (n<=0){
            Scanner sc=new Scanner(System.in);
            System.out.println("(while) Xin moi nhap 1 so nguyen duong");
            n=sc.nextInt();
        }
        System.out.println("Đã nhập thành công");
    }
}
