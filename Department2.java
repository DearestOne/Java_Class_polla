import java.util.Scanner;
class Dept{
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;
    public int totalIncome,totalExpense;
    public int salary, elec, eduCost;
    public Dept(int people,int student){
        totalIncome = computeIncome(people, student);
        totalExpense = computeExpense(people, student);
        System.out.println("total income = " + totalIncome);
        System.out.println("total expense = " + totalExpense);
        System.out.println("income - expense = " + (totalIncome - totalExpense));
    }
    int computeIncome(int people,int student){
        ministryBudget = (people * 500000) + (student * 3000);
        eduFee = student * 5000;
        serviceFee = 300000;
        donation = 100000;
        return ministryBudget + eduFee + serviceFee + donation;
    }
    int computeExpense(int people,int student){
        salary = people * 600000;
        elec = (people + student) * 2000;
        eduCost = student * 4000;
        return salary + eduCost + elec;
    }
    void printReport(){
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}
public class Department2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        Dept d = new Dept(n, k);
        d.printReport();
    }
}
