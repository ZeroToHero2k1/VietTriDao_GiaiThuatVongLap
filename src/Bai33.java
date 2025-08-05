public class Bai33 {
    //dung chatgpt de sua loi do while in khoang trang
    public static void tamGiacCanDoWhile(int n){
        int i = 1;
        do {
            int j = 1;
            if(n-i>0) {
                do {
                    System.out.print(" ");
                    j++;
                } while (j <= n - i);
            }

            int k = 1;
            do {
                System.out.print("*");
                k++;
            } while (k <= 2 * i - 1);

            System.out.println();
            i++;
        } while (i <= n);
    }
}
