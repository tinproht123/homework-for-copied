//kế thừa class Person

public class Employee extends Person {
    //hệ số lương
    private float coefficientSalary;

    public Employee() {}

    public Employee(Integer id, String fullName, String address, float coefficientSalary) {
        super(id, fullName, address);
        this.coefficientSalary = coefficientSalary;
    }

    public float getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(float coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Coefficients salary: " + getCoefficientSalary());
        System.out.println("---------------------------");
    }
}
