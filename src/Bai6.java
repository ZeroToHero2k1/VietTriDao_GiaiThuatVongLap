public class Bai6 {
    public static void inDaySoAmDuongCach1(int n){
        System.out.println("Cách 1: Dùng dấu %");
        for (int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i*2*-1+",");
            }
            else if(i%2!=0){
                System.out.print(i*2+",");
            }
        }
        System.out.println(" ");
    }
    public static void inDaySoAmDuongCach2(int n){
        System.out.println("Cách 2: Dùng bien ki hieu");
        int sign=1;
        for (int i=1;i<=n;i++){
            System.out.print(i*2*sign+",");
            sign*=-1;
        }
        System.out.println(" ");
    }
}
