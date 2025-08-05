public class Bai5 {
    public static void tinhTong1ChiaN(int n){
        double s=0;
        System.out.println("S=1+1/2+1/3+...1/n");
        for (int i=1;i<=n;i++){
            s+= (double) 1 /i;
        }
        System.out.println("S:"+s);
    }
}
