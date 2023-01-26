import java.util.Scanner;
class Dept{
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;
    public Dept(int people,int student){
        computeIncome(people, student);
    }
    void computeIncome(int people,int student){
        ministryBudget = (people * 500000) + (student * 3000);
        eduFee = student * 5000;
        serviceFee = 300000;
        donation = 100000;
    }
    void printReport(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }
}
public class Department1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        Dept d = new Dept(n,k);
        d.printReport();
    }
}
