public class classclass{

  public static void main(String[] args) {
  
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        Employee e = staff[1];
        System.out.println(e.getClass().getName() + " " + e.getName());  
     
    
        try
        {
        String name = "test"; // get class name
        Class cl = Class.forName(name); // might throw exception
        // do something with cl
        }
        catch (Exception a)
        {
        a.printStackTrace();
        }
  }

}
