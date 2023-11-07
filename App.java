public class App {
    public static void main(String[] args) throws Exception {
       
        employee work = new employee();
        manager manager1 = new manager();
        executive excutive1 = new executive();

        work.name();
        manager1.name();
        manager1.salary();
        manager1.department();
        excutive1.name();

    }


}
class employee{
    String name;
    int salary;

   public void name(){
        System.out.println(" Wadon");
    }
    public void salary(){
        System.out.println(7000);
    }
    

   
}
class manager extends employee{
    String department;

    public void department(){
        System.out.println("Computer Science");
    }
    

}

class executive extends manager{

}
  