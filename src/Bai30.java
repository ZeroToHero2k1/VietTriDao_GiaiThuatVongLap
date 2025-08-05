public class Bai30 {
    public static void inDaySoFibonance(int n){
        int a=1,b=2;
        do{
            System.out.print(a+",");
            int next=a+b;
            a=b;
            b=next;
        }while (a<=n);
    }
}
