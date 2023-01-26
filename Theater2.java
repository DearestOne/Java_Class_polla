import java.util.Scanner;
class Theater {
    // You can enter your code here and only here.
    public boolean[] seats;
    public boolean is3D,isLux;
    public int maxseats,basePrice;
    public String title;
    public Theater(boolean is3D,boolean isLux,int maxseats){
        seats = new boolean[maxseats + 1];
        this.is3D = is3D;
        this.isLux = isLux;
        this.maxseats = maxseats;
    }
    void setTitle(String title){
        if(title == null || title.length() == 0){
            System.out.println("invalid title");
            this.title = "";
        }
        else{
            this.title = title;
        }
    }
    void setBasePrice(int price){
        if(price <= 0){
            System.out.println("invalid price");
        }
        else{
            this.basePrice = price;
        }
    }
    int reserveOne(int seatNumber){
        boolean inrange = seatNumber > 0 && seatNumber < maxseats;
        if(inrange){
            if(!seats[seatNumber]){
                seats[seatNumber] = true;
                return basePrice;
            }
            else{
                System.out.println("sorry");
                return -1;
            }
        }
        else{
            System.out.println("sorry");
            return -1;
        }
    }
    int reserveMultiple(int numSeats, int seatNumber){
        boolean inrange = seatNumber > 0 && seatNumber + numSeats <= maxseats + 1;
        if(inrange){
            for(int i=seatNumber;i<numSeats + seatNumber;i++){
                if(seats[i]){
                    System.out.println("sorry");
                    return -1;
                }
            }
            for(int i=seatNumber;i<numSeats + seatNumber;i++){
                seats[i] = true;
            }
            return basePrice * numSeats;
        }
        else{
            System.out.println("sorry");
            return -1;
        }
    }
    void printInfo(){
        System.out.println(is3D ? "3D" : "No 3D");
        System.out.println(isLux ? "Luxury" : "Standard");
        System.out.println(seats.length - 1);
        System.out.println(title.length() > 0 ? title : "title is not set");
        System.out.println(basePrice > 0 ? basePrice : "price is not set");
    }
}
// Do not modify the code below. You must leave it as is.
public class Theater2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if(threeD1 == 1)
            threeD = true;
        if(luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if(numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if(totalPrice > 0)
                System.out.println(totalPrice);
        }

        t.printInfo();
    }
}
