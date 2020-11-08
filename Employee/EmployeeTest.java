package Employee;

public class EmployeeTest{
    public static void main (String[] args){
    //  Employee[] staff = new Employee[3];
    //  staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
    //  staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
    //  staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
     
    //  for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
    
    Employee[] staff = new Employee[4];
    int i;
    staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
    staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
    staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
    staff[3] = new Employee("Isabel Vidal", 1500000, 1, 13, 1993);
    Sortable.shell_sort(staff);
    for (i = 0; i < 4; i++) staff[i].print();
    // if(staff[2].compare(staff[1]) == -1){
    //     staff[0].print();
    //     System.out.println( "=-1");
    // }else{
    //     System.out.println("1");
    // }



    }
}