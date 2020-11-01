class Overload{
    public int salary;
    
    
    public void raiseSalary(int y)
    {
       salary = y ;
    }
    
    public void raiseSalary(int y,int x);
    {
       salary = y + x ;
    }
    
    
    public static void tripleSalary(Overload x) // works
    {
      x.raiseSalary(200);
      
    }
    
    
    public static void main(String[] args){
      Overload test = new Overload();
      System.out.println(test.salary);
      tripleSalary(test);
      System.out.println(test.salary);
      
      
    }

}
