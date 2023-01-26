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
    void printInfo(){
        System.out.println(is3D ? "3D" : "No 3D");
        System.out.println(isLux ? "Luxury" : "Standard");
        System.out.println(seats.length - 1);
        System.out.println(title.length() > 0 ? title : "title is not set");
        System.out.println(basePrice > 0 ? basePrice : "price is not set");
    }
}
// Do not modify the code below. You must leave it as is.
public class Theater1 {
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

        String dummy = scan.nextLine();// throw away a new line character
        String title = scan.nextLine();
        if(title.compareTo("-1") == 0)
            t.setTitle(null);
        else
            t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();
    }
}