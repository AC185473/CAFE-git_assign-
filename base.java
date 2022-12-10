import java.util.*;
class Cafe{
    public static void main(String[] args) {
        System.out.println("*** Welcome to Interns Cafe ***");
        System.out.println("******************************************");
        System.out.println("Select your Order Category");
        System.out.println("1.Hot Beverages \n 2.Juices \n 3.Snacks");
        System.out.println("******************************************");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        menu m=new menu();
        switch(choice){
            case 1: m.hotbeverages();break;
            case 2: m.juices(); break;
            case 3: m.snacks(); break;
            default: 
                     System.out.println("Invalid input entered");
        }
    }
}

class menu{
    public void hotbeverages(){}
    public void juices(){}
    public void snacks(){}
}
