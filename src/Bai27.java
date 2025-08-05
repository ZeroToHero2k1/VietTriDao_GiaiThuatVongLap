public class Bai27 {
    public static void TamGiacCanBangVongLapWhile(int n){
        int i=1;
        while(i<=n){
            int j=1,k=1;
            while (j<=n-i){
                System.out.print(" ");
                j++;
            }
            while(k<=(2*i-1)){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println(" ");
        }
    }
}
