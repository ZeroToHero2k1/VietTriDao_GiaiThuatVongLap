public class Bai18 {
    public static void inDaySo(int n){
        double s=0;
        for(int i=1;i<=n;i++){
            int tich=1;
            int mauSo=2*i-1;
            for(int j=1;j<=mauSo;j++){
                tich*=j;
            }
            s+=(double) 1/tich;
        }
        System.out.println("Ket qua la: "+s);
    }
}
