public class Bai38 {
    //dung gemini moi ra, cong nhan kho that
    public static void inDaySoKhoNhat(int n){
        int giaTriHienTai = 2;
        int demSoTrongCum = 0;
        int kichThuocCum = 2;
        int soDaIn = 0;

        while (soDaIn < n) {
            // In số ra màn hình
            if (demSoTrongCum < kichThuocCum - 1) {
                // Các số dương
                System.out.print(giaTriHienTai + " ");
            } else {
                // Số cuối cùng của cụm là số âm
                System.out.print(-giaTriHienTai + " ");
            }

            // Tăng giá trị và các biến đếm
            giaTriHienTai += 2;
            demSoTrongCum++;
            soDaIn++;

            // Kiểm tra xem đã kết thúc một cụm chưa
            if (demSoTrongCum == kichThuocCum) {
                demSoTrongCum = 0;
                kichThuocCum++; // Tăng kích thước của cụm tiếp theo
            }
        }
    }
}
