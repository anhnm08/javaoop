package objectclass;

public class SinhVien {
    private String name;
    private int age;
    private String address;
    private String className;

    //Constructor - Hàm xây dựng không tham số
    public SinhVien() {
        name = "Phương";
        age = 32;
        address = "Hà nội";
        className = "Java Basic";
        // Hàm khởi tên này để khởi tạo 4 giá trị mặc định trên
    }
    //Hàm xây dựng có tham số
    public SinhVien(String name, int age, String address, String className){

        this.name = name; //this.name chính là chỉ biến private name của class sẽ là name truyền vào
        this.age = age ;
        this.address = address;
        this.className = className;

         /* nếu không có từ khoá this, biến name (cái đứng trước) trong hàm xây dựng có tham số này sẽ hiểu là
        lấy biến Name khai báo của class Sinh Vien ban đầu, và biến Name ban đầu đó chỉ mới khai báo, chưa có giá trị truyền vào
         => do đó cần dùng this để máy hiển là name ở đây sẽ nhận giá trị name truyền vào khi khởi tạo đối tượng
         */
    }

    public void getInfo(){  //mục đích để in ra info của 4 biến
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(className);
    }

    public int getAge() {
        return age;
    }

    //Các hàm truy xuất thông tin
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getclassName(){
        return className;
    }
}
