public class Bai17 {
    public static void inDaySo(int n){
        double s=0;
        for (int i=1;i<=n;i++){
            int tich=1;
            for(int j=1;j<=i;j++){
               tich*=j;
            }
            s+=(double) 1/tich;
        }
        System.out.println("Ket qua la: "+s);
    }
}
