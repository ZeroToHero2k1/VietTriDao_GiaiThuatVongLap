public class Bai23 {
    public static void VeHinhTamGiacVuong1(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void VeHinhTamGiacVuong2(int n){
        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //dung chatgpt
    public static void VeHinhTamGiacVuong3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void VeHinhTamGiacVuong4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=n;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void VeHinhTamGiacVuong5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i+j==n+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }


    //dung chatgpt
    public static void VeHinhTamCan1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void VeHinhTamCan2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=2*n;k>=2*i;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
