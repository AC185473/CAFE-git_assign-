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
        System.out.println("Juices");
    System.out.println("*******************************");
    System.out.println("Chose your juice");
    System.out.println("1.MuskMelon\n2.Grapes\n3.Orange");
    System.out.println("*******************************");
    int choice=sc.nextInt();
    switch(choice){
        case 1:System.out.println("MuskMelon price is:60 INR");break;
        case 2:System.out.println("Grapes price is:70 INR");break;
        case 3:System.out.println("Orange price is:40 INR");break;
        default:System.out.println("Invalid Choice");
            }
    
    }
    public void snacks(){
        System.out.println("Snacks");
    System.out.println("*******************************");
    System.out.println("Chose your Snacks");
    System.out.println("1.Pizza\n2.Burger\n3.Sandwich");
    System.out.println("*******************************");
    int choice=sc.nextInt();
    switch(choice){
        case 1:System.out.println("Pizza price is:200 INR");break;
        case 2:System.out.println("Burger price is:150 INR");break;
        case 3:System.out.println("Sandwich price is:100 INR");break;
        default:System.out.println("Invalid Choice");
            }
    }
}
