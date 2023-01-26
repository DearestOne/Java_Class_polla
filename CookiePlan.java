import java.util.Scanner;
public class CookiePlan {
    static int planCookie(int[] flour,int[] butter){
        int fail = 0;
        for(int i=0;i<flour.length;i++){
            int min = Math.min(flour[i]/6,butter[i]/3);
            if(min < 10){
                System.out.println(i + 1);
                fail++;
            }
        }
        return fail;
    }
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] b = new int[n];
        int[] f = new int[n];
        for(int i=0;i<n;i++){
            f[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int result = planCookie(f, b);
        System.out.print("There are " + result + " days ");
        System.out.println("that ingredients are insufficient");
    }
}
