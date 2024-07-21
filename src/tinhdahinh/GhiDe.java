package tinhdahinh;

public class GhiDe extends Action{
    //Xảy ra kế thừa class Cha và class Con
    //Tên hàm của class Con giống tên hàm của class cha

    @Override

    public void clickElement(){ //Hàm ở class Con trùng tên với hàm ở class Cha
        System.out.println("Click on button Login");
    }

    public void login(){
        System.out.println("https://anhtester.com");
        System.out.println("Email: anhtester.com");
        System.out.println("Password: 12345678");
        clickElement();

    }

    public static void main (String[] args){
        GhiDe ghiDe = new GhiDe();
        ghiDe.login();
    }

}
