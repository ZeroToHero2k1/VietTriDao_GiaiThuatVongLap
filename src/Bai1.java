public class Bai1 {
    public static void inDaySo(int n){
        for (int i=1;i<=n;i++){
            if(i<n)
                System.out.print(i+",");
            else
                System.out.print(i);
        }
        System.out.println(" ");
    }
}
