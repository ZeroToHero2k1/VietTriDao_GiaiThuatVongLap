public class Bai10 {
    //Bai nay em ko lam duoc, phai dung chatgpt
    public static void inDaySoFibonanci(int n){
        int a=1;
        int b=2;
        while (a<=n){
            System.out.print(a+",");
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println(" ");
    }
}
