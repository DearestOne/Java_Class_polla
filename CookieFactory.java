import java.util.Scanner;
class CookiePlanner{
    public int FlourPerBag,ButterPerBag;
    public int flour = 0,bags = 0;
    public int butter = 0;
    public CookiePlanner(int F,int B){
        FlourPerBag = F;
        ButterPerBag = B;
    }
    int calculate(){
        int f = flour / FlourPerBag;
        int b = butter / ButterPerBag;
        int result = Math.min(f,b);
        return result;
    }
    boolean produce(int target){
        int tbutter = target * ButterPerBag;
        int tflour = target * FlourPerBag;
        boolean isEnough = tbutter <= butter && tflour <= flour;
        if(isEnough){
            butter -= tbutter;
            flour -= tflour;
            bags += target;
            System.out.print(bags + " ");
            return true;
        }
        else{
            System.out.print("Max capacity = " + calculate() + " bags, but ");
            System.out.print(target + " bags requested ");
            return false;
        }
    }
    boolean addFlour(int amount){
        if(amount > 0){
            flour += amount;
            System.out.print(flour + " ");
            return true;
        }
        else{
            System.out.print("Invalid flour quantity ");
            return false;
        }
    }
    boolean addButter(int amounts){
        if(amounts > 0){
            this.butter += amounts;
            System.out.print(this.butter + " ");
            return true;
        }
        else{
            System.out.print("Invalid butter quantity ");
            return false;
        }
    }
    void reportProduction(){
        System.out.println("Cookie bags: " + bags);
        System.out.println("Flour left: " + flour);
        System.out.println("Butter left: " + butter);
    }
}
public class CookieFactory {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int F = scan.nextInt();
        int B = scan.nextInt();
        CookiePlanner cp = new CookiePlanner(F, B);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int k = scan.nextInt();
            int a = scan.nextInt();
            if(k == 1){
                System.out.println(cp.addFlour(a));
            }
            else if(k == 2){
                System.out.println(cp.addButter(a));
            }
            else{
                System.out.println(cp.produce(a));
            }
        }
        cp.reportProduction();
    }
}
