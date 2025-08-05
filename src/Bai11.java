public class Bai11 {
    public static void inDaySo(int n){
        int i=1;
        while(i<=n){
            System.out.print(i + ",");
            i = (2 * i) + 1;
        }
        System.out.println(" ");
    }
}
