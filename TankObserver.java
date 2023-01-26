import java.util.Scanner;
class WaterTank {
    int capacity;
    int volume = 0;
    int fill(int amount){
        if(volume + amount > capacity){
            System.out.println("Cannot fill the tank");
            return -1;
        }
        volume += amount;
        return volume;
    }
}
public class TankObserver{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        WaterTank tank = new WaterTank();
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        tank.capacity = width * length * height;
        for(int i=0;i<5;i++){
            int x = scan.nextInt();
            System.out.println(tank.fill(x));
        }
    }
}
