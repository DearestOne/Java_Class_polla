import java.util.Scanner;
import java.util.ArrayList;
class Food{
    String name;
    int weight;
    int cal;
    ArrayList<String> ingredient = new ArrayList<String>();
    public Food(String name,String ingre,int weight,int cal){
        this.name = name;
        ingredient.add(ingre);
        this.weight = weight;
        this.cal = cal * weight;
    }
    void addContent(String ingre,int weight,int cal){
        this.weight += weight;
        this.cal += cal * weight;
        ingredient.add(ingre);
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(weight + " " + cal);
        for(int i=0;i<ingredient.size();i++){
            System.out.print(ingredient.get(i) + " ");
        }
    }
}
public class FoodContents2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String name = scan.nextLine();
        String ingredient = scan.next();
        int weight = scan.nextInt();
        int CalPerWeight = scan.nextInt();
        Food f = new Food(name, ingredient, weight, CalPerWeight);
        for(;;){
            int option = scan.nextInt();
            if(option == 0){
                break;
            }
            else if(option == 1){
                f.printInfo();
            }
            else{
                String in = scan.next();
                int w = scan.nextInt();
                int cpw = scan.nextInt();
                f.addContent(in,w,cpw);
            }
        }
    }
}
