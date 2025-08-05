public class Bai2 {
    public static void inDaySoLeCach1(int n){
        for (int i=1;i<=n;i++){
            if(i%2!=0)
                System.out.print(i+",");
        }
        System.out.println(" ");
    }

    public static void inDaySoLeCach2(int n){
        for (int i=1;i<=n;i+=2){
                System.out.print(i+",");
        }
        System.out.println(" ");
    }
}
