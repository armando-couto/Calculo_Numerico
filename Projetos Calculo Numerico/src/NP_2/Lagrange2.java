package NP_2;

public class Lagrange2 {

	public static void main(String argv[]) {
	    double xi[] = { -1, 0, 2 };
	    double fi[] = { 4, 1, -1 };
	    double x = 0.9;
	    double f = upwardDownward(x, xi, fi);
	    System.out.println("Interpolated value:  " + f);
	  }

	// Method to complete the interpolation via upward and
	// downward corrections.

	  public static double upwardDownward(double x,
	    double xi[], double fi[]) {
	    int n = xi.length-1;
	    double dp[][] = new double[n+1][];
	    double dm[][] = new double[n+1][];

	 // Assign the 1st columns of the corrections
	    dp[0] = (double[]) fi.clone();
	    dm[0] = (double[]) fi.clone();
	  
	 // Find the closest point to x
	    int j0 = 0, k0 = 0;
	    double dx = x-xi[0];
	    for (int j=1; j<=n; ++j) {
	      double dx1 = x-xi[j];
	      if (Math.abs(dx1)<Math.abs(dx)) {
	        j0 = j;
	        dx = dx1;
	      }
	    }
	    k0 = j0;

	 // Evaluate the rest of the corrections recursively
	    for (int i=1; i<=n; ++i) {
	      dp[i] = new double[n-i+1];
	      dm[i] = new double[n-i+1];
	      for (int j=0; j<n-i+1; ++j) {
	        double d = dp[i-1][j]-dm[i-1][j+1];
	        d /= xi[i+j]-xi[j];
	        dp[i][j] = d*(xi[i+j]-x);
	        dm[i][j] = d*(xi[j]-x);
	      }
	    }

	 // Update the interpolation with the corrections
	    double f = fi[j0];
	    for (int i=1; i<=n; ++i) {
	      if (((dx<0)||(k0==n)) && (j0!=0)) {
	        j0--;
	        f += dp[i][j0];
	        dx = -dx;
	      }
	      else {
	        f += dm[i][j0];
	        dx = -dx;
	        k0++;
	      }
	    }
	     return f;
	  }
}
