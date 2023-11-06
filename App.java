public class App {
    public static void main(String[] args) throws Exception {
       person student1=new person("kofi", 2000);
       student student2=new student("Yaw", 2005, "computer science");
        instructor student3=new instructor("adloa", 2007, 7000);

        System.out.println("The salary of the instructor is " + student3.getsalary());
        System.out.println("The name of the student is " + student2.getname());

    }


}

class person{
    String name;
    int yearofBirth;

    public person(String name, int yearofBirth){
        this.name=name;
        this.yearofBirth=yearofBirth;
    }
        public String getname(){
        return name;
    }
    public int getyearofBirth(){
        return yearofBirth;
    }

    }


  class student extends person{
    String major;
public student(String name, int yearofBirth, String major){
    super(name, yearofBirth);
    this.major=major;
}

    public String getmajor(){
        return major;
    }
}

  class instructor extends person{
    int salary;
    public instructor(String name, int yearofBirth, int salary){
    super(name, yearofBirth);
    this.salary=salary;

    }
    public int getsalary(){
        return salary;
    }

  }