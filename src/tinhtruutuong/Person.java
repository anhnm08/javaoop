package tinhtruutuong;

abstract class Person {

    protected String ten;
    protected int tuoi;
    protected String cmnd;

    abstract public void showInfo();    //để hiển thị thông tin cơ bản của 1 người
    abstract public String getTen();
    abstract public int getTuoi();
    abstract public String getCmnd();

}