package montecarlosimulation;

/**
 *
 * @author Khwilo
 */
public class MonteCarloSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a      = 0;
        double b      = 3.14512;
        double point1 = 0;
        double point2 = 0;
        double point3 = 0;
        double point4 = 0;
        double point5 = 0;
        
        point1 = monteCarlo(point1, a, b, 10);
        point2 = monteCarlo(point2, a, b, 20);
        point3 = monteCarlo(point3, a, b, 40);
        point4 = monteCarlo(point4, a, b, 80);
        point5 = monteCarlo(point5, a, b, 160);
        
        System.out.println("______________________________________________");
        System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\n", "n", "10", "20", "40", "80", "160");
        System.out.println("______________________________________________");
        System.out.printf("\n%s\t%.3f\t%.3f\t%.3f\t%.3f\t%.3f\n", "Y(n)", point1, point2, point3, point4, point5);
        System.out.println("______________________________________________");
    }
    
    public static double monteCarlo(double point, double a, double b, int n ){
        double sum = 0;
        for(int i = 0; i < n; i++){
            /* generating the random intervals
             * the intervals are between zero and pi
             */
            point = Math.sin( a + (b - a) * Math.random());
            sum += point;
        }
        double approx = (sum / n) * (b - a);
        return approx;
    }
}
