public class Bai9 {
    public static void inDaySoLeWhile1(int n){
        int i=1;
        while(i<=n){
            if(i%2!=0)
                System.out.print(i+",");
            i++;
        }
        System.out.println(" ");
    }
    public static void inDaySoLeWhile2(int n){
        int i=1;
        while(i<=n){
            System.out.print(i+",");
            i+=2;
        }
        System.out.println(" ");
    }
}
