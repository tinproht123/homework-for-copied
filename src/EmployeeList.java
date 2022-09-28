import java.util.*;

public class EmployeeList {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();
    private Integer currentNumberInList = 0;

    public Integer getCurrentNumberInList() {
        return currentNumberInList;
    }

    public void setCurrentNumberInList(Integer currentNumberInList) {
        this.currentNumberInList = currentNumberInList;
    }

    public void addEmployeeIntoList() {
        Scanner sc = new Scanner(System.in);
        char c;
        do{
            Employee newEmployee = new Employee();
            System.out.println("Insert " + (getCurrentNumberInList() + 1) + "th employee's info: ");
            //auto update id
            newEmployee.setId(getCurrentNumberInList() + 1);
            System.out.print("Full name: " );
            newEmployee.setFullName(sc.nextLine());
            System.out.print("Address: ");
            newEmployee.setAddress(sc.nextLine());
            System.out.print("Coefficients salary: ");
            newEmployee.setCoefficientSalary(sc.nextFloat());
            //increase number
            setCurrentNumberInList(getCurrentNumberInList() + 1);
            //save info
            employeeArrayList.add(newEmployee);
            System.out.println("Type anything to continue, or type 'c' to exit: ");
            c = sc.next().charAt(0);
            sc.nextLine();
        } while(c != 'c');
    }

    public void displayInfoInlist(){
        for(Employee employee:this.employeeArrayList){
            employee.printInfo();
        }
    }
}
