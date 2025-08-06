public class Bai7 {
    public static void tinhGiaiThua(int n){
        double s=1;
        for (int i=1;i<=n;i++){
            s*=i;
        }
        System.out.println("Giai thua cua "+n+" la: "+s);
    }
}
