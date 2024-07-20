package objectclass.phamvitruycap;

public class information {
    public static void main (String[] args){
        employee employ1 = new employee();
        // employ1.getInfoPrivate();    //sẽ không truy cập được do class employee đang private

        employ1.getInfoProtected(); // lấy được do khác class, nhưng cùng package phamvitruycap
        employ1.getInfoDefault();
        System.out.println(employ1.getName());
        System.out.println(employ1.getCompany());

    }
}
