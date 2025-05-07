public class Employee {

    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayinfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee Salary:"+salary);
    }
    public static void main(String[] args) {
        Employee emp1=new Employee("ABC",101,20000.0);
        emp1.displayinfo();
    }
}