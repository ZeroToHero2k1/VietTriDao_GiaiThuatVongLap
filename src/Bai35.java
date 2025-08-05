public class Bai35 {
    //Nếu được su dung thư viện, em sẽ xài StringBuidler cho lẹ
    public static void thapToNhi(int n){
        String str="";
        while(n>0){
            int bit=n%2;
            str=str.concat(String.valueOf(bit));
            n=n/2;
        }
        char[] c= str.toCharArray();
        String strReverse="";
        for(int i= c.length-1;i>=0;i--){
            strReverse=strReverse.concat(String.valueOf(c[i]));
        }
        System.out.println("Nhi phan la: "+strReverse);
    }
}
