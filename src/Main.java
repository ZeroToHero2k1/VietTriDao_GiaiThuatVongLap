import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n:");
        int n=sc.nextInt();
        System.out.println("Bai 1");
        Bai1.inDaySo(n);
        System.out.println("Bai 2");
        Bai2.inDaySoLeCach1(n);
        Bai2.inDaySoLeCach2(n);
        System.out.println("Bai 3");
        Bai3.inDaySoChan(n);
        System.out.println("Bai 4");
        Bai4.TinhTong(n);
        System.out.println("Bai 5");
        Bai5.tinhTong1ChiaN(n);
        System.out.println("Bai 6");
        Bai6.inDaySoAmDuongCach1(n);
        Bai6.inDaySoAmDuongCach2(n);
        System.out.println("Bai 7");
        Bai7.tinhGiaiThua(n);
        System.out.println("Bai 8");
        Bai8.inDaySoBangWhile(n);
        System.out.println("Bai 9");
        Bai9.inDaySoLeWhile1(n);
        Bai9.inDaySoLeWhile2(n);
        System.out.println("Bai10");
        Bai10.inDaySoFibonanci(n);
        System.out.println("Bai11");
        Bai11.inDaySo(n);
        System.out.println("Bai12");
        Bai12.inDaySo(n);
        System.out.println("Bai13");
        Bai13.tachVaTinhTongVaTich(234);
        System.out.println("Bai14");
        Bai14.timUCLNVaBCNN(7,5);
        System.out.println("Bai17");
        Bai17.inDaySo(n);
        System.out.println("Bai18");
        Bai18.inDaySo(n);
        System.out.println("Bai19");
        Bai19.inHinhVuong(n);
        System.out.println("Bai20");
        Bai20.inHinhVuongAB(n);
        System.out.println("Bai21");
        Bai21.inHinhVuongAB(n);
        System.out.println(" ");
        System.out.println("Bai22");
        Bai22.inHinhVuongFull(n);
        System.out.println(" ");
        Bai22.onlyCanhHinhVuong(n);
        System.out.println(" ");
        Bai22.HinhVuongChuC(n);
        System.out.println(" ");
        Bai22.HinhVuongChuCNguoc(n);
        System.out.println(" ");
        Bai22.HinhVuongChuU(n);
        System.out.println(" ");
        System.out.println("Bai23");
        Bai23.VeHinhTamGiacVuong1(n);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}