import java.util.ArrayList;
import java.util.Scanner;
class food{
    public String name;
    public ArrayList<String> ingredient = new ArrayList<String>();
    public int weight;
    public food(String name,String name_Ingredient,int weight){
        this.name = name;
        ingredient.add(name_Ingredient);
        this.weight = weight;
    }
    void addContent(String name_Ingredient,int weight){
        this.weight += weight;
        ingredient.add(name_Ingredient);
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(weight);
        for(int i=0;i<ingredient.size();i++){
            System.out.print(ingredient.get(i) + " ");
        }
        System.out.println();
    }
}
public class FoodContents1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String name = scan.nextLine();
        String ingredient = scan.next();
        int weight = scan.nextInt();
        food f = new food(name, ingredient, weight);
        for(;;){
            int option = scan.nextInt();
            if(option == 0){
                break;
            }
            else if(option == 1){
                f.printInfo();
            }
            else{
                String p = scan.next();
                int w = scan.nextInt();
                f.addContent(p, w);
            }
        }
    }
}
