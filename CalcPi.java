// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int N = Integer.parseInt(args[0]);

		double sum = 0.0;
		double sign = 1.0;

		for(int i = 0; i < N ; i++) {
			double k = 2 * i + 1.0;
			double term = sign * (1.0 / k);
			sum = sum + term;
			sign = -sign;

			double piApprox = 4.0 * sum;
			
			System.out.println("pi according to java: " + Math.PI );
			System.out.println("pi, approximated:     " + piApprox );
		}
	}
}
 
		
