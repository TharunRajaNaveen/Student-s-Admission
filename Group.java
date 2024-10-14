import java.util.*;
public class Group{
    String name;
    int seats;
    int cutoff;
    int fee;
    public Group(String name,int seats,int cutoff,int fee){
        this.name=name;
        this.seats=seats;
        this.cutoff=cutoff;
        this.fee=fee;
    }
    @Override
    public String toString(){
        return name+" "+seats+" "+cutoff+" "+fee;
    }
    public static void reduce(String dept,ArrayList<Group> group){
        for(Group s:group){
            if(s.name.equals(dept)){
                s.seats=s.seats-1;
                break;
            }
        }
    }
}