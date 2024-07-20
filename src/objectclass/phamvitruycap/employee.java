package objectclass.phamvitruycap;

public class employee {

    //Phạm vi truy cập private

    private String name = "Phương";
    private int age = 30;
    public String company = "FPT";

    private void getInfoPrivate(){
        System.out.println(name);
        System.out.println(age);
    }

    //Phạm vi truy cập protected - truy cập sang các class khác được, nhưng phải ở cùng 1 package
    protected void getInfoProtected(){
        System.out.println(name);
        System.out.println(age);
    }

    //Hàm không có phạm vi truy cập - hay phạm vi truy cập là default
    void getInfoDefault(){
        System.out.println("Đây là hàm có phạm vi truy cập default");
    }

    //Phạm vi truy cập public - phạm vi truy cập ở mọi nơi trong src
    public String getName(){
        return name;    // bên trên biến name là private
    }
    public String getCompany(){
        return company; // bên trên biến company là public
    }

    public static void main (String[] args){
        employee employ1 = new employee();
        System.out.println(employ1.name);
    }

}
