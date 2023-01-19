// BUS1
import java.util.Scanner;
class Route {
    public String[] name;
    public int[] distance;
    public Route(String name[],int distance[]){
        this.name = name;
        this.distance = distance;
    }
    void getStopInfo(int num){
        boolean inrange = num > 0 && num <= name.length;
        if(inrange){
            System.out.println(name[num - 1] + " " + distance[num - 1]);
        }
        else{
            System.out.println("invalid number");
        }
    }
}
public class BusRoute1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] station_name = new String[n];
        int[] distance = new int[n];
        for(int i=0;i<n;i++){
            station_name[i] = scan.next();
            distance[i] = scan.nextInt();
        }
        Route r = new Route(station_name, distance);
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int x = scan.nextInt();
            r.getStopInfo(x);
        }
    }
}