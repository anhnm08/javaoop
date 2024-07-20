package objectclass;

import java.util.ArrayList;

public class Company {
   public static void main (String[] args){

       //Khởi tạo đối tượng class SinhVien

       SinhVien sv1 = new SinhVien("Vân", 40, "Hà Nam", "AutoTest");
       //sv1.getInfo();

       System.out.println("__________________");

       SinhVien sv2 = new SinhVien("Hoa", 34, "Hạ Long", "API test");
       //sv2.getInfo();

       SinhVien sv3 = new SinhVien("Nam", 25, "Thái Nguyên", "ISTQB");


       ArrayList<String> arrayList = new ArrayList<>();
       arrayList.add("Selenium");
       arrayList.add("Auto");

       System.out.println("__________________");

       ArrayList<SinhVien> listSinhVien = new ArrayList<>(); // <SinhVien> để lưu nguyên bộ data của SinhVien
       listSinhVien.add(sv1);  //Thêm bộ data sv1 vào vị trí đầu tiên trong ArrayList
       listSinhVien.add(sv2);
       listSinhVien.add(sv3);

       for(SinhVien sv: listSinhVien){ //SinhVien ở đây coi như kiểu dữ liệu; sv là đối tượng; listSinhVien là ArrayList
           System.out.println("__________________");
           sv.getInfo();
       }

   }
}
