package objectclass.thongtin;

import objectclass.phamvitruycap.employee;

public class ThongTinNhanVien extends employee{

    public void XuLyLuong(){
        getInfoProtected();
    }

    public static void main(String[] args) {
        employee employ1 = new employee();
        System.out.println(employ1.getName());
        System.out.println(employ1.getCompany());
    }
}

