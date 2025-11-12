// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int N = Integer.parseInt(args[0]);
        String mode = args[1]; 
        
        for (int seed = 1; seed <= N; seed++) {
            
            long curr = seed; 
            int len = 1; 
            
            if (mode.equals("v")) {
                System.out.print(seed);
            }
            
            if (seed == 1) {
                curr = 4;
                len++;
                if (mode.equals("v")) {
                    System.out.print(" 4");
                }
            }
            
            while (curr != 1) {
                
                if (curr % 2 == 0) {
                    curr = curr / 2;
                } else {
                    curr = 3 * curr + 1; 
                }
                
                len++;
                
                if (mode.equals("v")) {
                    System.out.print(" " + curr);
                }
            }
            
            if (mode.equals("v")) {
                System.out.println(" (" + len + ")");
            }
        }
        
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}