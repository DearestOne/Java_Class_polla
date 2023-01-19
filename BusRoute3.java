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
    void summarizeRoute(){
        int sum_distance = 0;
        for(int i=0;i<name.length;i++){
            sum_distance += distance[i];
        }
        System.out.print(name[0] + " " + name[name.length - 1]);
        System.out.println(" " + sum_distance);
    }
    void getTripInfo(int start,int stop){
        boolean inrange = start > 0 && stop <= name.length;
        boolean order = start < stop;
        if(inrange && order){
            int sum_distance = 0;
            for(int i=start;i<stop;i++){
                sum_distance += distance[i];
            }
            System.out.print(name[start - 1] + " " + name[stop - 1] + " ");
            System.out.println(sum_distance);
        }
        else{
            System.out.println("invalid number");
        }
    }
}
public class BusRoute3 {
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
            int start = scan.nextInt();
            int stop = scan.nextInt();
            r.getTripInfo(start,stop);
        }
    }
}
