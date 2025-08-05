public class Bai25 {
    public static void duyetMang2ChieuBangWhile(int n){
        int i=1;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.println(i+"-"+j);
                j++;
            }
            i++;
        }
    }
}
