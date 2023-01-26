import java.util.Scanner;
class ZooTicket{
    String name;
    boolean ride,seal,tiger;
    int price = 100;
    public ZooTicket(String name){
        this.name = name;
    }
    void bookRide(){
        ride = true;
        price += 40;
    }
    void bookSealShow(){
        seal = true;
        price += 50;
    }
    void bookTigerShow(){
        tiger = true;
        price += 65;
    }
    void summarize(){
        System.out.println(name);
        System.out.printf(ride ? "Ride\n" : "");
        System.out.printf(seal ? "Seal\n" : "");
        System.out.printf(tiger ? "Tiger\n" : "");
        System.out.println(price);
    }
    boolean useRide(){
        if(ride){
            System.out.println("okay");
            ride  = false;
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
    boolean enterSealShow(){
        if(seal){
            System.out.println("okay");
            seal = false;
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
    boolean enterTigerShow(){
        if(tiger){
            System.out.println("okay");
            tiger = false;
            return true;
        }
        else{
            System.out.println("no");
            return false;
        }
    }
}
public class ZooTicket2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String name = scan.nextLine();
        ZooTicket zoo = new ZooTicket(name);
        for(;;){
            int option = scan.nextInt();
            if(option == 0){
                break;
            }
            else if(option == 1){
                zoo.bookRide();
            }
            else if(option == 2){
                zoo.bookSealShow();
            }
            else{
                zoo.bookTigerShow();
            }
        }
        zoo.summarize();
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int A = scan.nextInt();
            if(A == 1){
                System.out.println(zoo.useRide());
            }
            else if(A == 2){
                System.out.println(zoo.enterSealShow());
            }
            else{
                System.out.println(zoo.enterTigerShow());
            }
        }
    }
}
