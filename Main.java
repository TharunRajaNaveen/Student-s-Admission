/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=1;
		ArrayList<Group> group=new ArrayList<>();
		ArrayList<Admn> admn=new ArrayList<>();
		group.add(new Group("Biology",35,450,20000));
		group.add(new Group("Computer_Science",40,400,15000));
		group.add(new Group("Commerce",50,300,10000));
		for(Group s:group)
		System.out.println(s);
		while(c==1){
		    System.out.println("Welcome you all to acquire Knowledge");
		    System.out.println("Enter 1 to see your Eligibility criteria....... or Enter 2 to exit");
		    c=sc.nextInt();
		    if(c==1){
		        System.out.println("Enter the Course you want:");
		        String course=sc.next();
		        System.out.println("Enter your Totalmark:");
		        int totalmark=sc.nextInt();
		        if(Eligibility.isEligible(course,totalmark,group)){
		            System.out.println("Are you Willing to Join. Click yes to fill the or no to exit");
		            String s=sc.next();
		            if(s.equals("yes")){
		                System.out.print("Enter the Student's name: ");
		                String sname=sc.next();
		                System.out.println();
		                System.out.print("Enter the Student's age: ");
		                int age=sc.nextInt();
		                System.out.println();
		                System.out.print("Gender: ");
		                String gender=sc.next();
		                System.out.println();
		                System.out.print("Enter the Department: ");
		                String dept=sc.next();
		                System.out.println();
		                System.out.println();
		                System.out.println(".....................Admission done Successfully........................");
		                System.out.println("Here is your Receipt");
		                Group.reduce(dept,group);
		                admn.add(new Admn(sname,age,gender,dept));
		                Admn.display(sname,age,gender,dept);
		                System.out.println();
		                System.out.print("*__________________________________________________________________________*");
		                System.out.println();
		                System.out.println();
		            }
		            else{
		                System.out.print("Thank You...");
		                System.exit(0);
		            }
		        }
		    }
		    else{
		        System.out.println("Thank you....");
		    }
		}
	}
}