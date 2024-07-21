package tinhtruutuong;

import tinhdahinh.GhiDe;

public class SinhVien extends Person{

    public SinhVien(String ten, int tuoi, String cmnd){
        this.ten = ten;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
    }

    @Override
    public void showInfo(){
        System.out.println(ten);
        System.out.println(tuoi);
        System.out.println(cmnd);

    }

    @Override
    public String getTen() {
        return "";
    }

    @Override
    public int getTuoi() {
        return 0;
    }

    @Override
    public String getCmnd() {
        return "";
    }

    public static void main (String[] args){
        SinhVien sinhVien = new SinhVien("anh", 23, "1234567890");

        sinhVien.showInfo();
    }


}
