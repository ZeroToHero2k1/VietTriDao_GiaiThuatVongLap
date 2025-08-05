public class Bai14 {
    public static void timUCLNVaBCNN(int a,int b){
        //nay em xai chatgpt
        int initA=a;
        int initB=b;
        if(a==0||b==0){
            System.out.println("Khong co uoc chung va bcnn la 0");
        }
        else{
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            System.out.println("Uoc chung lon nhat: "+a);
            System.out.println("Boi chung nho nhat: "+((initA*initB)/a));
        }
    }
}
