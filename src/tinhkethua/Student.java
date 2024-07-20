package tinhkethua;

public class Student extends Person {
    public String universityName;
    public Student(String name, int age, float height, String universityName) {
        super(name, age, height); // Đảm bảo đúng cấu trúc từ hàm xây dựng của class Person
        this.universityName = universityName; // biến riêng của class Student
    }

    //Ghi đè phương thức khi muong muốn lưu giữ lại đúng tên phương thức từ class Cha, còn nội dung của class Con
    public void getInfo(){
        super.getInfo(); //Gọi hàm phương thức của Class Person
        System.out.println(this.universityName);//Thêm thông tin của clas Student

    }

    public void getInfoStudent(){
        super.getInfo(); //Gọi hàm phương thức của Class cha
        System.out.println(this.universityName);
    }

    public static void main (String[] args){
        Student student = new Student ("anh", 21, 155, "ftu");
        student.getInfo(); // hàm getInfo này thuộc về class Student, do đã ghi đè phương thức
        System.out.println("_________");
        student.getInfoStudent();// vẫn gọi được dù giống nội dung, nhưng khác tên rồi
    }
}
