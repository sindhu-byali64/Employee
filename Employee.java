public class Employee {

    String name;
    int id;
    double salary;
    String add;
    public Employee(String name,int id,double salary,String add){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.add=add;
    }
    public void displayinfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee Salary:"+salary);
        System.out.println("addr"+add);
    }
    public static void main(String[] args) {
        Employee emp1=new Employee("ABC",101,20000.0,"hubli");
        emp1.displayinfo();
    }
}