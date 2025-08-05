public class Bai34 {
//    34.	Hãy phân tích sự khác nhau giữa break và continue ở 2 đoạn code sau đây:
//    Đoạn code 1:
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i > 6) {
//                break;
//            }
//            System.out.print(i);
//        }
//    }
//    Đoạn code 2:
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i > 6) {
//                continue;
//            }
//            System.out.print(i);
//        }
//    }
    //Dù nó trả về kết quả giống nhau là 123456
    // break thì sẽ kết thúc ngay vòng lặp, in đến 6 rồi ra khỏi vòng lap, thực hiện các lệnh khác trong hàm (nếu có)
    // continue thì vẫn chạy tiếp vòng lặp đến khi i=10, nhưng nó sẽ bỏ qua các i lớn hơn 6 (skip qua nếu i>6)
    // bonus: nếu return; thì có nghĩa là kết thúc hàm luôn chứ không phải kết thúc vòng lặp như break nữa :>

}
