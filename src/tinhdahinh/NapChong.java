package tinhdahinh;

public class NapChong {

    //trong 1 class được phép Khai báo nhiều hàm tên giống nhau, nhưng khác nhau về tham số

    public void getInfo(){
        System.out.println("Hàm getInfo không có tham số");
    }

    public void getInfo(String name){
        System.out.println("Name: " + name);
        System.out.println("Address: Hà Nội");
    }

    public void getInfo(String name, String address){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    //Ví dụ thực tế cho 1 trường hợp login trên web
    public void login(String url, String email, String password){
        //Login thông thường
    }

    public void login(String url, String email, String password, String role){
        //Kiểm tra account thuộc role nào
    }

    public void login(String url, String email, String password, String role, String message){
        //Kiểm tra account thuộc role nào
        //Kiểm tra text của message sau khi login (pass/fail)
    }


    public static void main (String[] args){
        NapChong napChong = new NapChong();
        napChong.getInfo("Anh");
        napChong.getInfo("Anh1", "Ba Vì");
    }

}
