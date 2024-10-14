public class Admn{
    String sname;
    int age;
    String gender;
    String dept;
    public Admn(String sname,int age,String gender,String dept){
        this.sname=sname;
        this.age=age;
        this.gender=gender;
        this.dept=dept;
    }
    public static void display(String sname,int age,String gender,String dept){
        System.out.println("Name : " + sname);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("dept : " + dept);
    }
}