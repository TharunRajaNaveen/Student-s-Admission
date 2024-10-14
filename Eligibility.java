import java.util.*;
public class Eligibility{
    public static boolean isEligible(String course,int cutoff,ArrayList<Group> group){
        int c=-1;
        Group l=group.get(0);
        for(Group g:group){
            if(g.name.equals(course)){
                l=g;
                c=1;
                break;
            }
        }
        if(c==-1)
        {
            System.out.println("The group asked by you was not available in our school");
            return false;
        }
        if(l.seats<1){
            System.out.println("The seat is already full");
            return false;
        }
        if(l.cutoff>cutoff){
            System.out.println("You have not met the Eligible cutoff.Better luck next time!!!");
            return false;
        }
        System.out.println("You are Eligible for our Admission process, Continue by filling your Application");
        System.out.println("Your fee was "+l.fee);
        return true;
    }
}