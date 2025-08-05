public class Bai3 {
    public static void inDaySoChan(int n){
        for (int i=1;i<=n;i++){
            if(i<n)
                System.out.print(i*2+",");
            else
                System.out.print(i*2);
        }
        System.out.println(" ");
    }
}
