public class Bai4 {
    public static void TinhTong(int n){
        int s=0;
        System.out.println("S=1+2+3+...n");
        for (int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println("S:"+s);
    }
}
