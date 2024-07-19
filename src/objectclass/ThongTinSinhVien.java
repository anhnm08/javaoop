package objectclass;

public class ThongTinSinhVien {

    public static void main (String[] args){

    //TH1: Không truyền tham số

        //Khai báo đối tượng trong 1 class để truy xuất thông tin trong 1 class
        SinhVien sv1 = new SinhVien(); // object sv1 của class SinhVien; Class SinhVien() không có tham số tương ứng với hàm xây dựng không có tham số

        //Gọi thành phần trong class thông qua đối tượng
        System.out.println(sv1.getName());
        System.out.println(sv1.getclassName());
        System.out.println(sv1.getAddress());
        System.out.println(sv1.getAge());

    //TH2: Truyền tham số, dù cho 2 Class giống tên nhau, nhưng nếu truyền tham số khi gọi, máy sẽ hiển là mình đang ứng với hàm xây dựng có tham số
        //Khởi tạo đối tượng cho Class Sinh viên, nhưng với cấu trúc hàm Constructor có tham số
        SinhVien sv2 = new SinhVien("Huyền", 21, "Hồ Chí Minh", "Java OOP");
        System.out.println("______________________");
        System.out.println(sv2.getName());
        System.out.println(sv2.getclassName());
        System.out.println(sv2.getAddress());
        System.out.println(sv2.getAge());

    //Ví dụ truy xuất thông tin class thông qua khởi tạo đối tượng Anonymous
        System.out.println("______________________");
        System.out.println(new SinhVien().getName());
        System.out.println(new SinhVien().getclassName());
 //Khi dùng anonymous như trên là phải khởi tạo nhiều lần (2 lần new) => tốn bộ nhớ

    }
}
