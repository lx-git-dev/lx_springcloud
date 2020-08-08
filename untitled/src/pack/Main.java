package pack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<user> list= new ArrayList<>();
    static  List<user> childMenu=new ArrayList<user>();
    static {

        for (int i = 0; i <10 ; i++) {
            String name="h";
            user u=new user();
            u.setId(i+"");
            u.setParent(i+1+"");
            list.add(u);
        }
        System.out.println(list.toString());
    }
    public static void main(String[] args) {


        Main m=new Main();
        List<user> users = m.find("4",list);
        System.out.println(users.toString());
    }
    public List<user> find(String id,List<user> list2){
        for(user u:list){
            System.out.println("u.getParent()="+u.getParent()+"    id="+id);
            if (u.getParent().equals(id)){
                childMenu.add(u);
                find(u.getId(),list2);
            }
        }
        return childMenu;
    }
}
