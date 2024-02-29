import java.util.ArrayList;
import java.util.Scanner;

public class OrderingSystem {
    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {
        mainMenu();
       
    }

    static void mainMenu (){
        do{
        System.out.println(" Menu \n 1. Best Sellers \n 2. Drinks \n 3. Desserts \n 4. Exit");
        int a = s.nextInt();
        userInput(a);    

        }while(true);

    }
    static void userInput (int menuChoice){
        do{
            switch (menuChoice) {
                case 1:
                    System.out.println("Our Best Sellers!");
                    System.out.println(" 1. Burger \n 2. Fries \n 3. back to main Menu \n 4. Exit");
                    int bsInput = s.nextInt();
                    bestSellers(bsInput);
                    break;
                case 2:
                    System.out.println("Our Drinks!");
                    System.out.println(" 1. CocaCola \n 2. Pepsi \n 3. back to main Menu \n 4. Exit");
                    int dInput = s.nextInt();
                    Drinks(dInput);
                    break;
                case 3:
                    System.out.println("Our Desserts!");
                    System.out.println(" 1. Cake \n 2. Tapioca \n 3. back to main Menu \n 4. Exit");
                    int desInput = s.nextInt();
                    Desserts(desInput);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(true);
    }
    static void bestSellers(int bSchoice){
        do{ 
            
            switch (bSchoice) {
                case 1:
                    System.out.println("Burger");
                    System.out.print("Quantity: ");
                    int bSBQuantity = s.nextInt();
                    exitConfirm();
                    break;
                case 2:
                    System.out.println("Fries");
                    System.out.print("Quantity: ");
                    int bSFQuantity = s.nextInt();
                exitConfirm();
                    break;
                case 3:
                    mainMenu(); 
                    break;
            
                default:
                    break;
            }
        }while(true);
    }
    static void Drinks (int dChoice){
        do{
            switch (dChoice) {
                
                case 1:
                System.out.println("CocaCola");
                    System.out.print("Quantity: ");
                    int dCQuantity = s.nextInt();
                    exitConfirm();
                    
                    break;
                case 2:
                    System.out.println("Pepsi");
                    System.out.print("Quantity: ");
                    int dPQuantity = s.nextInt();
                exitConfirm();
                    break;
                case 3:
                    mainMenu();
                    break;
            
                default:
                    break;
            }
        }while(true);
    }
    static void Desserts (int desChoice){
        do{
            switch (desChoice) {
                case 1:
                    System.out.println("Cake");
                    System.out.print("Quantity: ");
                    int desCQuantity = s.nextInt();
                exitConfirm();
                    break;
                case 2:
                    System.out.println("Burger");
                    System.out.print("Quantity: ");
                    int desTQuantity = s.nextInt();
                exitConfirm();
                    break;
                case 3:
                    mainMenu();
                    break;
            
                default:
                    break;
            }
        }while(true);
    }
    static void exitConfirm () {
        do{
            System.out.println("is that all? \n 'Y/N'");
            char confirm = s.next().charAt(0);
            switch (confirm) {
                case 'y':
                    System.exit(0);
                    break;
                case 'n':
                    System.out.println("okay");
                    mainMenu();
                    break;
            
                default:
                    break;
            }
            
        }while(true);
    }   
}
    
    

  