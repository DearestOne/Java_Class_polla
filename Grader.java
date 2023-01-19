public class Grader {
    public String name;
    public String desc;
    public int[] pts;
    public String[] sols;
    public Grader(String name,String problem,int[] score,String[] solution){
        this.name = name;
        desc = problem;
        pts = java.util.Arrays.copyOf(score,score.length);
        sols = java.util.Arrays.copyOf(solution,score.length);
    }
}
