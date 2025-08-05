public class Bai31 {
    public static void mang2ChieuDoWhile(int n){
        int i=1;
        do{
            int j=1;
            do{
                System.out.println(i+"-"+j);
                j++;
            }while (j<=n);
            i++;
        }while (i<=n);

    }
}
