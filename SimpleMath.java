public class SimpleMath {
    double findMaxInArray(double[] array){
        double max = -Double.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            max = Math.max(array[i],max);
        }
        return max;
    }
}
