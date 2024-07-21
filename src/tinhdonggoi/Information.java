package tinhdonggoi;

public class Information {

    public static void main (String[] args){

        Student student = new Student();

        student.setName("Anh");
        student.setAge(23);
        student.setGender("Nữ");
        student.setAddress("HN");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Address: " + student.getAddress());

        System.out.println("__________________");

        student.setName("Anh1");
        System.out.println("Name: " + student.getName());

        Student student2 = new Student();
        System.out.println("Name: " + student2.getName());  //Output: Name: null
        // Vì chỉ có đối tượng student được set giá trị, giờ muốn student2 có giá trị thì phải set

        System.out.println("__________________");

        student2.setName("Anh2");
        student2.setAge(232);
        student2.setGender("Nữ2");
        student2.setAddress("HN2");
        System.out.println("Name: " + student2.getName());

    }

}
