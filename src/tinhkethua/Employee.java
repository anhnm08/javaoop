package tinhkethua;

public class Employee extends Person{

    public Employee(String name, int age, float height){
        super(name,age,height);
    }

    public static void main (String[] args) {
        Employee employee = new Employee("Mai", 32, 155);
        employee.getInfo();
    }

}
