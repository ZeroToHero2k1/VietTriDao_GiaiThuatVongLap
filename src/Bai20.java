public class Bai20 {
    public static void inHinhVuongAB(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0)
                    System.out.print("B");
                else
                    System.out.print("A");
            }
            System.out.println(" ");
        }
    }
}
