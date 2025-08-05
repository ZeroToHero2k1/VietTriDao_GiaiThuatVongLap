public class Bai37 {
    public static void inDaySoChanAmChanC1(int n){
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("-"+(2*i)+",");
            }else{
                System.out.print((2*i)+",");
            }
        }
    }
    public static void inDaySoChanAmChanC2(int n){
        for(int i=2;i<=2*n;i+=2){
            if(i%3==0){
                System.out.print("-"+i+",");
            }else{
                System.out.print(i+",");
            }
        }
    }
}
