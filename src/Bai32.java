public class Bai32 {
    public static void TamGiacVuongDoWhile(int n){
        int i=1;
        do{
            int j=1;
            do{
                System.out.print("*");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<=n);
    }
}
