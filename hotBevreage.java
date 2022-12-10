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
    Scanner sc=new Scanner(System.in);
    public void hotbeverages(){
    System.out.println("HOT BEVERAGES");
    System.out.println("*******************************");
    System.out.println("Chose your beverage");
    System.out.println("1.Milk\n2.Coffee\n3.Tea");
    System.out.println("*******************************");
    int choice=sc.nextInt();
    switch(choice){
        case 1:System.out.println("Milk price is:15 INR");break;
        case 2:System.out.println("Coffee price is:20 INR");break;
        case 3:System.out.println("Tea price is:25 INR");break;
        default:System.out.println("Invalid Choice");
            }
    
        
    }
    public void juices(){
        System.out.println("Cold BEVERAGES");
    System.out.println("*******************************");
    System.out.println("Chose your beverage");
    System.out.println("1.Milk\n2.Coffee\n3.Tea");
    System.out.println("*******************************");
    int choice=sc.nextInt();
    switch(choice){
        case 1:System.out.println("Milk price is:15 INR");break;
        case 2:System.out.println("Coffee price is:20 INR");break;
        case 3:System.out.println("Tea price is:25 INR");break;
        default:System.out.println("Invalid Choice");
            }
    
    }
    public void snacks(){}
}
