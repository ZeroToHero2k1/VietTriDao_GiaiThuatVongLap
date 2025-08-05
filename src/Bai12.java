public class Bai12 {
    public static void inDaySo(int n){
        int i=1;
        int signed=1;
        while(i<=n){
            if(signed==1) {
                System.out.print(i + ",");
            } else if (signed==-1) {
                System.out.print("-"+i + ",");
            }
            i = i * 2 + 1;
            signed*=-1;
        }
        System.out.println(" ");
    }
}
