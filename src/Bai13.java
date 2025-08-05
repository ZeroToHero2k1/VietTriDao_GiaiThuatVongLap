public class Bai13 {
    public static void tachVaTinhTongVaTich(int n){
        int s=0;
        int p=1;
        while (n!=0){
            int tach=n%10;
            n/=10;
            s+=tach;
            p*=tach;
        }
        System.out.println("S= "+s);
        System.out.println("P= "+p);
    }
}
