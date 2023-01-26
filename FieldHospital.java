import java.util.Scanner;
class FieldManager{
    public int bed;
    public boolean[] reserve;
    public FieldManager(int bed){
        this.bed = bed;
        reserve = new boolean[bed];
    }
    int reserveBed(){
        for(int i=0;i<bed;i++){
            if(!reserve[i]){
                reserve[i] = true;
                return i;
            }
        }
        return -1;
    }
    boolean discharge(int num){
        if(reserve[num - 1]){
            reserve[num - 1] = false;
            System.out.println("Patient discharged");
            return true;
        }
        else{
            System.out.println("Invalid bed number");
            return false;
        }
    }
    void report_bed(){
        int count = 0;
        for(int i=0;i<bed;i++){
            if(reserve[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class FieldHospital {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        FieldManager field = new FieldManager(n);
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            int k = scan.nextInt();
            int a = scan.nextInt();
            if(k == 1){
                int result = field.reserveBed();
                if(result == -1){
                    System.out.println("No bed vacancy");
                }
                else{
                    System.out.println("Bed " + (result + 1) + " reserved");
                }
            }
            else if(k == 2){
                field.discharge(a);
            }
            else if(k == 3){
                field.report_bed();
            }
        }
    }
}