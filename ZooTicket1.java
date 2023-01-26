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
}
public class ZooTicket1 {
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
    }
}