public class Bai26 {
    public static void TamGiacVuongDungWhile(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
