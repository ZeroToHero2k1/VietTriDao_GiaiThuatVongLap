public class Bai40 {
//    40.	Vì sao 2 đoạn code sau chạy ra kết quả giống nhau:
//
//            for (int i = 1; i <= 5; i++) {
//        for (int j = 1; j <= 5; j++) {
//            System.out.println(i + " " + j);
//        }
//    }
//
//		for (int i = 1; i <= 5; i++)
//            for (int j = 1; j <= 5; j++)
//            System.out.println(i + " " + j);

//    nếu for có {}, nghĩa là for có body thì taast cả những gì ben trong {} đều là thành phần của nó
//    nếu for không có {}, thì thành phần của nó se la cau lệnh ngay sau nó
//    code 1: "for i" chứ "for j" trong ngoặc {}, "for j" là con của "for i", lệnh in trong ngoặc của "for j" nên lệnh in là con của "for j"
//
//    code 2: lệnh in ngay sau câu lệnh "for j", chỉ duy nhất 1 dòng code sau for j trong đoạn code này => lệnh in là con "for j"
//            "for j" ngay sau lệnh "for i" => "for j" la con của "for i"
//    => code 1 và code 2 có mối quan hệ như nhau=> code giống nhau dù bên có {}, bên không {}

}
